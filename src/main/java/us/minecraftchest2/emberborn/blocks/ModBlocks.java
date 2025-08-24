package us.minecraftchest2.emberborn.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import us.minecraftchest2.emberborn.item.ModItems;
import us.minecraftchest2.emberborn.itemgroups.ModItemGroup;
import us.minecraftchest2.emberborn.registerers.BlockRegisterer;

public class ModBlocks {

    public static final Block PEWTER_BLOCK = BlockRegisterer.register(
            "pewter_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.IRON_GRAY));
    public static final Block BRASS_BLOCK = BlockRegisterer.register(
            "brass_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.GOLD));
    public static final Block BRONZE_BLOCK = BlockRegisterer.register(
            "bronze_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.BROWN));
    public static final Block COPPER_BLOCK = BlockRegisterer.register(
            "copper_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.ORANGE));
    public static final Block IRON_BLOCK = BlockRegisterer.register(
            "iron_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.IRON_GRAY));
    public static final Block STEEL_BLOCK = BlockRegisterer.register(
            "steel_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.GRAY));
    public static final Block TIN_BLOCK = BlockRegisterer.register(
            "tin_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.LIGHT_GRAY));
    public static final Block ZINC_BLOCK = BlockRegisterer.register(
            "zinc_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL).strength(0.9f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.OFF_WHITE));

    public static final Block ZINC_ORE = BlockRegisterer.register(
            "zinc_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.STONE_GRAY));
    public static final Block TIN_ORE = BlockRegisterer.register(
            "tin_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.STONE_GRAY));
    public static final Block COPPER_ORE = BlockRegisterer.register(
            "copper_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.STONE_GRAY));
    public static final Block IRON_ORE = BlockRegisterer.register(
            "iron_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f)
                    .pistonBehavior(PistonBehavior.NORMAL).mapColor(MapColor.STONE_GRAY));


    public static void initialize() {
    }
}
