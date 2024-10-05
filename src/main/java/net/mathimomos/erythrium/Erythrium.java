package net.mathimomos.erythrium;

import com.mojang.logging.LogUtils;
import net.mathimomos.erythrium.block.ModBlocks;
import net.mathimomos.erythrium.block.entity.ModBlockEntities;
import net.mathimomos.erythrium.entity.ModEntities;
import net.mathimomos.erythrium.entity.client.TomathiBaseRenderer;
import net.mathimomos.erythrium.entity.client.TomathiBigRenderer;
import net.mathimomos.erythrium.entity.client.TomathiGreenRenderer;
import net.mathimomos.erythrium.entity.client.TomathiLongRenderer;
import net.mathimomos.erythrium.item.ModCreativeModeTabs;
import net.mathimomos.erythrium.item.ModItems;
import net.mathimomos.erythrium.loot.ModLootModifiers;
import net.mathimomos.erythrium.recipe.ModRecipies;
import net.mathimomos.erythrium.screen.DiamondCutterScreen;
import net.mathimomos.erythrium.screen.MetalurgicStationScreen;
import net.mathimomos.erythrium.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(Erythrium.MOD_ID)
public class Erythrium {
    public static final String MOD_ID = "erythrium";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Erythrium() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipies.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ERYTHRIUM);
            event.accept(ModItems.ROUGH_ERYTHRIUM);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // rYou can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.DIAMOND_CUTTER_MENU.get(), DiamondCutterScreen::new);
            MenuScreens.register(ModMenuTypes.METALURGIC_STATION_MENU.get(), MetalurgicStationScreen::new);
            EntityRenderers.register(ModEntities.TOMATHI_BASE.get(), TomathiBaseRenderer::new);
            EntityRenderers.register(ModEntities.TOMATHI_LONG.get(), TomathiLongRenderer::new);
            EntityRenderers.register(ModEntities.TOMATHI_GREEN.get(), TomathiGreenRenderer::new);
            EntityRenderers.register(ModEntities.TOMATHI_BIG.get(), TomathiBigRenderer::new);
        }
    }
}
