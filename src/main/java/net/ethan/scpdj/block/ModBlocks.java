package net.ethan.scpdj.block;

import net.ethan.scpdj.block.custom.CabinetBlock;
import net.ethan.scpdj.main.Mod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod.MODID);

    // Blocks
    public static final DeferredBlock<Block> exterior_brick_middle = BLOCKS.register("exterior_brick_middle",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> exterior_brick_bottom = BLOCKS.register("exterior_brick_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> exterior_brick_top = BLOCKS.register("exterior_brick_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> white_tiles = BLOCKS.register("white_tiles",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> duct = BLOCKS.register("duct",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> facility_concrete_gray = BLOCKS.register("facility_concrete_gray",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> facility_concrete_lightgray = BLOCKS.register("facility_concrete_lightgray",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> floor_wood = BLOCKS.register("floor_wood",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> generic_facility_wall = BLOCKS.register("generic_facility_wall",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> generic_facility_wall_blood = BLOCKS.register("generic_facility_wall_blood",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> generic_facility_wall_cracked = BLOCKS.register("generic_facility_wall_cracked",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> reinforced_panel1 = BLOCKS.register("reinforced_panel1",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> reinforced_panel2 = BLOCKS.register("reinforced_panel2",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> reinforced_panel3 = BLOCKS.register("reinforced_panel3",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> rusty_iron_block = BLOCKS.register("rusty_iron_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> steel_block = BLOCKS.register("steel_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> steel_block_darker = BLOCKS.register("steel_block_darker",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> vent = BLOCKS.register("vent",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> very_rusty_iron_block = BLOCKS.register("very_rusty_iron_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> black_checkered_tiles = BLOCKS.register("black_checkered_tiles",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> dark_tiles = BLOCKS.register("dark_tiles",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> red_checkered_tiles = BLOCKS.register("red_checkered_tiles",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    // Walls
    public static final DeferredBlock<Block> black_wall_bottom = BLOCKS.register("black_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> black_wall_top = BLOCKS.register("black_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> blue_wall_bottom = BLOCKS.register("blue_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> blue_wall_top = BLOCKS.register("blue_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> brown_wall_bottom = BLOCKS.register("brown_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> brown_wall_top = BLOCKS.register("brown_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> cyan_wall_bottom = BLOCKS.register("cyan_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> cyan_wall_top = BLOCKS.register("cyan_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> gray_wall_bottom = BLOCKS.register("gray_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> gray_wall_top = BLOCKS.register("gray_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> green_wall_bottom = BLOCKS.register("green_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> green_wall_top = BLOCKS.register("green_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lightblue_wall_bottom = BLOCKS.register("lightblue_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lightblue_wall_top = BLOCKS.register("lightblue_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lightgray_wall_bottom = BLOCKS.register("lightgray_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lightgray_wall_top = BLOCKS.register("lightgray_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lime_wall_bottom = BLOCKS.register("lime_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> lime_wall_top = BLOCKS.register("lime_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> magenta_wall_bottom = BLOCKS.register("magenta_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> magenta_wall_top = BLOCKS.register("magenta_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> orange_wall_bottom = BLOCKS.register("orange_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> orange_wall_top = BLOCKS.register("orange_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> pink_wall_bottom = BLOCKS.register("pink_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> pink_wall_top = BLOCKS.register("pink_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> purple_wall_bottom = BLOCKS.register("purple_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> purple_wall_top = BLOCKS.register("purple_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> red_wall_bottom = BLOCKS.register("red_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> red_wall_top = BLOCKS.register("red_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> yellow_wall_bottom = BLOCKS.register("yellow_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> yellow_wall_top = BLOCKS.register("yellow_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_hcz_wall_bottom = BLOCKS.register("classic_hcz_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_hcz_wall_middle = BLOCKS.register("classic_hcz_wall_middle",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_hcz_wall_middle_bloody = BLOCKS.register("classic_hcz_wall_middle_bloody",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_hcz_wall_top = BLOCKS.register("classic_hcz_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_floor1 = BLOCKS.register("classic_lcz_floor1",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_floor2 = BLOCKS.register("classic_lcz_floor2",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_wall_bottom = BLOCKS.register("classic_lcz_wall_bottom",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_wall_middle1 = BLOCKS.register("classic_lcz_wall_middle1",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_wall_middle1_bloody = BLOCKS.register("classic_lcz_wall_middle1_bloody",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_wall_middle2 = BLOCKS.register("classic_lcz_wall_middle2",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> classic_lcz_wall_top = BLOCKS.register("classic_lcz_wall_top",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
    public static final DeferredBlock<Block> grate = BLOCKS.register("grate",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0f)));
        // Testing
    public static final DeferredBlock<Block> cabinet = BLOCKS.register("cabinet", ()-> new CabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).dynamicShape().noOcclusion()));
}