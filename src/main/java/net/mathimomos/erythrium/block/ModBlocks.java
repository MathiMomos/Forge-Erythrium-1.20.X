package net.mathimomos.erythrium.block;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.custom.CopperChargerBlock;
import net.mathimomos.erythrium.block.custom.DamageOnStepBlock;
import net.mathimomos.erythrium.block.custom.DiamondCutterBlock;
import net.mathimomos.erythrium.block.custom.MetalurgicStationBlock;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Erythrium.MOD_ID);

    public static final RegistryObject<Block> ERYTHRIUM_BLOCK = registerBlock("erythrium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ERYTHRIUM_TILES_BLOCK = registerBlock("erythrium_tiles_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> REDDISH_DEEPSLATE_BLOCK = registerBlock("reddish_deepslate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> REDDISH_DEEPSLATE_TILES_BLOCK = registerBlock("reddish_deepslate_tiles_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ERYTHRIUM_ORE = registerBlock("erythrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> DEEPSLATE_ERYTHRIUM_ORE = registerBlock("deepslate_erythrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(4,8)));
    public static final RegistryObject<Block> COMPACTED_ERYTHRIUM = registerBlock("compacted_erythrium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)
                    .strength(1.75f).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> IGNITE_ORE = registerBlock("ignite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1.5f).requiresCorrectToolForDrops().lightLevel((state) -> 15), UniformInt.of(2,4)));
    public static final RegistryObject<Block> IGNITE_BLOCK = registerBlock("ignite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).lightLevel((state) -> 15)));

    public static final RegistryObject<Block> NETHER_ROSE_QUARTZ_ORE = registerBlock("nether_rose_quartz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(8,12)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    public static final RegistryObject<Block> FLINT_BLOCK = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> TOMATHI_BLOCK = registerBlock("tomathi_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.CORAL_BLOCK).strength(0.6F)));

    public static final RegistryObject<Block> COPPER_CHAGER = registerBlock("copper_charger",
            () -> new CopperChargerBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> 10)));

    public static final RegistryObject<Block> DIAMOND_CUTTER = registerBlock("diamond_cutter",
            () -> new DiamondCutterBlock(BlockBehaviour.Properties.copy(Blocks.STONECUTTER).noOcclusion()));

    public static final RegistryObject<Block> IRON_NUGGET_ORE = registerBlock("iron_nugget_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> METALURGIC_STATION = registerBlock("metalurgic_station",
            () -> new MetalurgicStationBlock(BlockBehaviour.Properties.copy(Blocks.STONECUTTER).noOcclusion().lightLevel((state) -> 15)));

    public static final RegistryObject<Block> RHYOLITE = registerBlock("rhyolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SCORIA = registerBlock("scoria",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            () -> new StairBlock(() -> ModBlocks.RHYOLITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SCORIA_STAIRS = registerBlock("scoria_stairs",
            () -> new StairBlock(() -> ModBlocks.SCORIA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIORITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GABBRO_STAIRS = registerBlock("gabbro_stairs",
            () -> new StairBlock(() -> ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> RHYOLITE_SLAB = registerBlock("rhyolite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SCORIA_SLAB = registerBlock("scoria_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GABBRO_SLAB = registerBlock("gabbro_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> RHYOLITE_WALL = registerBlock("rhyolite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SCORIA_WALL = registerBlock("scoria_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GABBRO_WALL = registerBlock("gabbro_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> POLISHED_RHYOLITE = registerBlock("polished_rhyolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
    public static final RegistryObject<Block> POLISHED_SCORIA = registerBlock("polished_scoria",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> POLISHED_GABBRO = registerBlock("polished_gabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> POLISHED_RHYOLITE_STAIRS = registerBlock("polished_rhyolite_stairs",
            () -> new StairBlock(() -> ModBlocks.RHYOLITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> POLISHED_SCORIA_STAIRS = registerBlock("polished_scoria_stairs",
            () -> new StairBlock(() -> ModBlocks.SCORIA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_STAIRS = registerBlock("polished_gabbro_stairs",
            () -> new StairBlock(() -> ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> POLISHED_RHYOLITE_SLAB = registerBlock("polished_rhyolite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> POLISHED_SCORIA_SLAB = registerBlock("polished_scoria_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_SLAB = registerBlock("polished_gabbro_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> SOULRRACK = registerBlock("soulrrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = registerBlock("soul_magma_block",
            () -> new DamageOnStepBlock(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).lightLevel((state) -> 3), 2.0f));

    public static final RegistryObject<Block> GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            () -> new DamageOnStepBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).lightLevel((state) -> 3), 1.0f));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
