package net.mathimomos.erythrium.recipe;

import net.mathimomos.erythrium.Erythrium;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipies {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Erythrium.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DiamondCutterRecipe>> DIAMOND_CUTTER_SERIALIZER =
            SERIALIZERS.register("diamond_cutter", () -> DiamondCutterRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<MetalurgicStationRecipe>> METALURGIC_STATION_SERIALIZER =
            SERIALIZERS.register("metalurgy", () -> MetalurgicStationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
