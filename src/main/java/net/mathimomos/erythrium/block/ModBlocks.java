package net.mathimomos.erythrium.block;

import net.mathimomos.erythrium.Erythrium;
import net.mathimomos.erythrium.block.custom.CopperChargerBlock;
import net.mathimomos.erythrium.block.custom.DiamondCutterBlock;
import net.mathimomos.erythrium.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
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
                    .strength(1.5f).requiresCorrectToolForDrops(), UniformInt.of(2,4)));
    public static final RegistryObject<Block> IGNITE_BLOCK = registerBlock("ignite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));

    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(8,12)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    public static final RegistryObject<Block> FLINT_BLOCK = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> TOMATHI_BLOCK = registerBlock("tomathi_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.CORAL_BLOCK).strength(0.6F)));

    public static final RegistryObject<Block> COPPER_CHAGER = registerBlock("copper_charger",
            () -> new CopperChargerBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> IRON_NUGGET_ORE = registerBlock("iron_nugget_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));


    public static final RegistryObject<Block> DIAMOND_CUTTER = registerBlock("diamond_cutter",
            () -> new DiamondCutterBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).noOcclusion()));

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
