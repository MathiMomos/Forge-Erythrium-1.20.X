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
                pOutput.accept(ModBlocks.ERYTHRIUM_BLOCK.get());
            })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
