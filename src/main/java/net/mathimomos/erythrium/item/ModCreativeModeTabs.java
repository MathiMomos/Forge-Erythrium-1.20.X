package net.mathimomos.erythrium.item;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Erythrium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ERYTHRIUM_TAB =CREATIVE_MODE_TABS.register("erythrium_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ERYTHRIUM.get()))
            .title(Component.translatable("erythrium.erythrium_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.ERYTHRIUM.get());
                pOutput.accept(ModItems.ROUGH_ERYTHRIUM.get());
                pOutput.accept(ModItems.ERYTHRIUM_TWIN.get());

                pOutput.accept(ModItems.ERYTHRIUM_SWORD.get());
                pOutput.accept(ModItems.ERYTHRIUM_PICKAXE.get());
                pOutput.accept(ModItems.ERYTHRIUM_AXE.get());
                pOutput.accept(ModItems.ERYTHRIUM_SHOVEL.get());
                pOutput.accept(ModItems.ERYTHRIUM_HOE.get());

                pOutput.accept(ModBlocks.ERYTHRIUM_BLOCK.get());
                pOutput.accept(ModBlocks.ERYTHRIUM_TILES_BLOCK.get());
                pOutput.accept(ModBlocks.REDDISH_DEEPSLATE_BLOCK.get());
                pOutput.accept(ModBlocks.REDDISH_DEEPSLATE_TILES_BLOCK.get());
                pOutput.accept(ModBlocks.ERYTHRIUM_ORE.get());
                pOutput.accept(ModBlocks.DEEPSLATE_ERYTHRIUM_ORE.get());
                pOutput.accept(ModBlocks.COMPACTED_ERYTHRIUM.get());

                pOutput.accept(ModItems.ROUGH_DIAMOND.get());
                pOutput.accept(ModItems.ROUGH_EMERALD.get());
                pOutput.accept(ModItems.LEATHER_FRAGMENT.get());
                pOutput.accept(ModItems.COPPER_PLATE.get());
                pOutput.accept(ModItems.IRON_PLATE.get());
                pOutput.accept(ModItems.GOLD_PLATE.get());
                pOutput.accept(ModItems.DIAMOND_TWIN.get());
                pOutput.accept(ModItems.LAZURITE.get());
                pOutput.accept(ModItems.ENCHANTED_TOME.get());

                pOutput.accept(ModItems.STARDUST.get());
                pOutput.accept(ModItems.NETHER_STAR_SHARD.get());
                pOutput.accept(ModItems.STARSHINE.get());

                pOutput.accept(ModItems.IGNITE.get());
                pOutput.accept(ModBlocks.IGNITE_ORE.get());
                pOutput.accept(ModBlocks.IGNITE_BLOCK.get());
                pOutput.accept(ModItems.ROSE_QUARTZ.get());
                pOutput.accept(ModBlocks.ROSE_QUARTZ_ORE.get());
                pOutput.accept(ModBlocks.ROSE_QUARTZ_BLOCK.get());

                pOutput.accept(ModBlocks.FLINT_BLOCK.get());

                pOutput.accept(ModItems.COPPER_NUGGET.get());
                pOutput.accept(ModItems.COPPER_CIRCUIT.get());

                pOutput.accept(ModItems.TOMATHI.get());
                pOutput.accept(ModItems.GLITTERMEAT.get());
                pOutput.accept(ModItems.OINKBALLS.get());

                pOutput.accept(ModItems.ERYTHRIUM_CROWN.get());
                pOutput.accept(ModItems.ERYTHRIUM_CHESTPLATE.get());
                pOutput.accept(ModItems.ERYTHRIUM_LEGGINGS.get());
                pOutput.accept(ModItems.ERYTHRIUM_BOOTS.get());

                pOutput.accept(ModBlocks.TOMATHI_BLOCK.get());

                pOutput.accept(ModBlocks.COPPER_CHAGER.get());

                pOutput.accept(ModBlocks.DIAMOND_CUTTER.get());

                pOutput.accept(ModItems.ERYTHRIUM_UPGRADE_SMITHING_TEMPLATE.get());
                pOutput.accept(ModBlocks.IRON_NUGGET_ORE.get());
                pOutput.accept(ModItems.RAW_IRON_NUGGET.get());

                pOutput.accept(ModItems.COPPER_HELMET.get());
                pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.COPPER_BOOTS.get());

                pOutput.accept(ModItems.EXPOSED_COPPER_HELMET.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_BOOTS.get());

                pOutput.accept(ModItems.WEATHERED_COPPER_HELMET.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_BOOTS.get());

                pOutput.accept(ModItems.OXIDIZED_COPPER_HELMET.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_CHESTPLATE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_LEGGINGS.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_BOOTS.get());

                pOutput.accept(ModItems.COPPER_SWORD.get());
                pOutput.accept(ModItems.COPPER_PICKAXE.get());
                pOutput.accept(ModItems.COPPER_AXE.get());
                pOutput.accept(ModItems.COPPER_SHOVEL.get());
                pOutput.accept(ModItems.COPPER_HOE.get());
                
                pOutput.accept(ModItems.EXPOSED_COPPER_SWORD.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_AXE.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.EXPOSED_COPPER_HOE.get());

                pOutput.accept(ModItems.WEATHERED_COPPER_SWORD.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_AXE.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.WEATHERED_COPPER_HOE.get());

                pOutput.accept(ModItems.OXIDIZED_COPPER_SWORD.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_PICKAXE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_AXE.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_SHOVEL.get());
                pOutput.accept(ModItems.OXIDIZED_COPPER_HOE.get());
            })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
