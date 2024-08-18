package net.mathimomos.erythrium.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.mathimomos.erythrium.Erythrium;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class MetalurgicStationRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final ResourceLocation id;

    public MetalurgicStationRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }

    @Override
    public boolean matches(SimpleContainer simpleContainer, Level level) {
        if (level.isClientSide() || inputItems.size() != 2) {
            return false;
        }

        ItemStack slot0 = simpleContainer.getItem(0);
        ItemStack slot1 = simpleContainer.getItem(1);

        boolean matchesNormal = inputItems.get(0).test(slot0) &&
                inputItems.get(1).test(slot1) &&
                slot0.getCount() >= 4 &&
                slot1.getCount() >= 4;

        boolean matchesReversed = inputItems.get(0).test(slot1) &&
                inputItems.get(1).test(slot0) &&
                slot0.getCount() >= 4 &&
                slot1.getCount() >= 4;

        return matchesNormal || matchesReversed;
    }

    @Override
    public ItemStack assemble(SimpleContainer simpleContainer, RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<MetalurgicStationRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "metalurgy";
    }

    public static class Serializer implements RecipeSerializer<MetalurgicStationRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(Erythrium.MOD_ID, "metalurgy");

        @Override
        public MetalurgicStationRecipe fromJson(ResourceLocation resourceLocation, JsonObject jsonObject) {
            ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "result"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(jsonObject, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size() && i < ingredients.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new MetalurgicStationRecipe(inputs, result, resourceLocation);
        }

        @Override
        public @Nullable MetalurgicStationRecipe fromNetwork(ResourceLocation resourceLocation, FriendlyByteBuf friendlyByteBuf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(friendlyByteBuf));
            }

            ItemStack result = friendlyByteBuf.readItem();
            return new MetalurgicStationRecipe(inputs, result, resourceLocation);
        }

        @Override
        public void toNetwork(FriendlyByteBuf friendlyByteBuf, MetalurgicStationRecipe pRecipe) {
            friendlyByteBuf.writeInt(pRecipe.inputItems.size());

            for (Ingredient ingredient : pRecipe.inputItems) {
                ingredient.toNetwork(friendlyByteBuf);
            }

            friendlyByteBuf.writeItemStack(pRecipe.getResultItem(null), false);
        }
    }
}
