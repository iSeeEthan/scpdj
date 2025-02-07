package net.ethan.scpdj.item;

import net.ethan.scpdj.block.ModBlocks;
import net.ethan.scpdj.main.Mod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod.MODID);


    public static final DeferredItem<Item> mop = ITEMS.registerSimpleItem("mop");
    public static final DeferredItem<Item> research_paper = ITEMS.registerSimpleItem("research_paper");
    public static final DeferredItem<Item> keycard_lvl0 = ITEMS.registerSimpleItem("keycard_lvl0");
    public static final DeferredItem<Item> keycard_lvl1 = ITEMS.registerSimpleItem("keycard_lvl1");
    public static final DeferredItem<Item> keycard_lvl2 = ITEMS.registerSimpleItem("keycard_lvl2");
    public static final DeferredItem<Item> keycard_lvl3 = ITEMS.registerSimpleItem("keycard_lvl3");
    public static final DeferredItem<Item> keycard_lvl4 = ITEMS.registerSimpleItem("keycard_lvl4");
    public static final DeferredItem<Item> keycard_lvl5 = ITEMS.registerSimpleItem("keycard_lvl5");
    public static final DeferredItem<Item> keycard_o5 = ITEMS.registerSimpleItem("keycard_o5");
    public static final DeferredItem<Item> keycard_omni = ITEMS.registerSimpleItem("keycard_omni");



    // Other
    public static final DeferredItem<BlockItem> exterior_brick_middle = ITEMS.registerSimpleBlockItem("exterior_brick_middle", ModBlocks.exterior_brick_middle);
    public static final DeferredItem<BlockItem> exterior_brick_bottom = ITEMS.registerSimpleBlockItem("exterior_brick_bottom", ModBlocks.exterior_brick_bottom);
    public static final DeferredItem<BlockItem> exterior_brick_top = ITEMS.registerSimpleBlockItem("exterior_brick_top", ModBlocks.exterior_brick_top);
    public static final DeferredItem<BlockItem> white_tiles = ITEMS.registerSimpleBlockItem("white_tiles", ModBlocks.white_tiles);
    public static final DeferredItem<BlockItem> duct = ITEMS.registerSimpleBlockItem("duct", ModBlocks.duct);
    public static final DeferredItem<BlockItem> facility_concrete_gray = ITEMS.registerSimpleBlockItem("facility_concrete_gray", ModBlocks.facility_concrete_gray);
    public static final DeferredItem<BlockItem> facility_concrete_lightgray = ITEMS.registerSimpleBlockItem("facility_concrete_lightgray", ModBlocks.facility_concrete_lightgray);
    public static final DeferredItem<BlockItem> floor_wood = ITEMS.registerSimpleBlockItem("floor_wood", ModBlocks.floor_wood);
    public static final DeferredItem<BlockItem> generic_facility_wall = ITEMS.registerSimpleBlockItem("generic_facility_wall", ModBlocks.generic_facility_wall);
    public static final DeferredItem<BlockItem> generic_facility_wall_blood = ITEMS.registerSimpleBlockItem("generic_facility_wall_blood", ModBlocks.generic_facility_wall_blood);
    public static final DeferredItem<BlockItem> generic_facility_wall_cracked = ITEMS.registerSimpleBlockItem("generic_facility_wall_cracked", ModBlocks.generic_facility_wall_cracked);
    public static final DeferredItem<BlockItem> reinforced_panel1 = ITEMS.registerSimpleBlockItem("reinforced_panel1", ModBlocks.reinforced_panel1);
    public static final DeferredItem<BlockItem> reinforced_panel2 = ITEMS.registerSimpleBlockItem("reinforced_panel2", ModBlocks.reinforced_panel2);
    public static final DeferredItem<BlockItem> reinforced_panel3 = ITEMS.registerSimpleBlockItem("reinforced_panel3", ModBlocks.reinforced_panel3);
    public static final DeferredItem<BlockItem> rusty_iron_block = ITEMS.registerSimpleBlockItem("rusty_iron_block", ModBlocks.rusty_iron_block);
    public static final DeferredItem<BlockItem> steel_block = ITEMS.registerSimpleBlockItem("steel_block", ModBlocks.steel_block);
    public static final DeferredItem<BlockItem> steel_block_darker = ITEMS.registerSimpleBlockItem("steel_block_darker", ModBlocks.steel_block_darker);
    public static final DeferredItem<BlockItem> vent = ITEMS.registerSimpleBlockItem("vent", ModBlocks.vent);
    public static final DeferredItem<BlockItem> very_rusty_iron_block = ITEMS.registerSimpleBlockItem("very_rusty_iron_block", ModBlocks.very_rusty_iron_block);
    public static final DeferredItem<BlockItem> black_checkered_tiles = ITEMS.registerSimpleBlockItem("black_checkered_tiles", ModBlocks.black_checkered_tiles);
    public static final DeferredItem<BlockItem> dark_tiles = ITEMS.registerSimpleBlockItem("dark_tiles", ModBlocks.dark_tiles);
    public static final DeferredItem<BlockItem> red_checkered_tiles = ITEMS.registerSimpleBlockItem("red_checkered_tiles", ModBlocks.red_checkered_tiles);
    // Walls
    public static final DeferredItem<BlockItem> black_wall_bottom = ITEMS.registerSimpleBlockItem("black_wall_bottom", ModBlocks.black_wall_bottom);
    public static final DeferredItem<BlockItem> black_wall_top = ITEMS.registerSimpleBlockItem("black_wall_top", ModBlocks.black_wall_top);
    public static final DeferredItem<BlockItem> blue_wall_bottom = ITEMS.registerSimpleBlockItem("blue_wall_bottom", ModBlocks.blue_wall_bottom);
    public static final DeferredItem<BlockItem> blue_wall_top = ITEMS.registerSimpleBlockItem("blue_wall_top", ModBlocks.blue_wall_top);
    public static final DeferredItem<BlockItem> brown_wall_bottom = ITEMS.registerSimpleBlockItem("brown_wall_bottom", ModBlocks.brown_wall_bottom);
    public static final DeferredItem<BlockItem> brown_wall_top = ITEMS.registerSimpleBlockItem("brown_wall_top", ModBlocks.brown_wall_top);
    public static final DeferredItem<BlockItem> cyan_wall_bottom = ITEMS.registerSimpleBlockItem("cyan_wall_bottom", ModBlocks.cyan_wall_bottom);
    public static final DeferredItem<BlockItem> cyan_wall_top = ITEMS.registerSimpleBlockItem("cyan_wall_top", ModBlocks.cyan_wall_top);
    public static final DeferredItem<BlockItem> gray_wall_bottom = ITEMS.registerSimpleBlockItem("gray_wall_bottom", ModBlocks.gray_wall_bottom);
    public static final DeferredItem<BlockItem> gray_wall_top = ITEMS.registerSimpleBlockItem("gray_wall_top", ModBlocks.gray_wall_top);
    public static final DeferredItem<BlockItem> green_wall_bottom = ITEMS.registerSimpleBlockItem("green_wall_bottom", ModBlocks.green_wall_bottom);
    public static final DeferredItem<BlockItem> green_wall_top = ITEMS.registerSimpleBlockItem("green_wall_top", ModBlocks.green_wall_top);
    public static final DeferredItem<BlockItem> lightblue_wall_bottom = ITEMS.registerSimpleBlockItem("lightblue_wall_bottom", ModBlocks.lightblue_wall_bottom);
    public static final DeferredItem<BlockItem> lightblue_wall_top = ITEMS.registerSimpleBlockItem("lightblue_wall_top", ModBlocks.lightblue_wall_top);
    public static final DeferredItem<BlockItem> lightgray_wall_bottom = ITEMS.registerSimpleBlockItem("lightgray_wall_bottom", ModBlocks.lightgray_wall_bottom);
    public static final DeferredItem<BlockItem> lightgray_wall_top = ITEMS.registerSimpleBlockItem("lightgray_wall_top", ModBlocks.lightgray_wall_top);
    public static final DeferredItem<BlockItem> lime_wall_bottom = ITEMS.registerSimpleBlockItem("lime_wall_bottom", ModBlocks.lime_wall_bottom);
    public static final DeferredItem<BlockItem> lime_wall_top = ITEMS.registerSimpleBlockItem("lime_wall_top", ModBlocks.lime_wall_top);
    public static final DeferredItem<BlockItem> magenta_wall_bottom = ITEMS.registerSimpleBlockItem("magenta_wall_bottom", ModBlocks.magenta_wall_bottom);
    public static final DeferredItem<BlockItem> magenta_wall_top = ITEMS.registerSimpleBlockItem("magenta_wall_top", ModBlocks.magenta_wall_top);
    public static final DeferredItem<BlockItem> orange_wall_bottom = ITEMS.registerSimpleBlockItem("orange_wall_bottom", ModBlocks.orange_wall_bottom);
    public static final DeferredItem<BlockItem> orange_wall_top = ITEMS.registerSimpleBlockItem("orange_wall_top", ModBlocks.orange_wall_top);
    public static final DeferredItem<BlockItem> pink_wall_bottom = ITEMS.registerSimpleBlockItem("pink_wall_bottom", ModBlocks.pink_wall_bottom);
    public static final DeferredItem<BlockItem> pink_wall_top = ITEMS.registerSimpleBlockItem("pink_wall_top", ModBlocks.pink_wall_top);
    public static final DeferredItem<BlockItem> purple_wall_bottom = ITEMS.registerSimpleBlockItem("purple_wall_bottom", ModBlocks.purple_wall_bottom);
    public static final DeferredItem<BlockItem> purple_wall_top = ITEMS.registerSimpleBlockItem("purple_wall_top", ModBlocks.purple_wall_top);
    public static final DeferredItem<BlockItem> red_wall_bottom = ITEMS.registerSimpleBlockItem("red_wall_bottom", ModBlocks.red_wall_bottom);
    public static final DeferredItem<BlockItem> red_wall_top = ITEMS.registerSimpleBlockItem("red_wall_top", ModBlocks.red_wall_top);
    public static final DeferredItem<BlockItem> yellow_wall_bottom = ITEMS.registerSimpleBlockItem("yellow_wall_bottom", ModBlocks.yellow_wall_bottom);
    public static final DeferredItem<BlockItem> yellow_wall_top = ITEMS.registerSimpleBlockItem("yellow_wall_top", ModBlocks.yellow_wall_top);
    public static final DeferredItem<BlockItem> classic_hcz_wall_bottom = ITEMS.registerSimpleBlockItem("classic_hcz_wall_bottom", ModBlocks.classic_hcz_wall_bottom);
    public static final DeferredItem<BlockItem> classic_hcz_wall_middle = ITEMS.registerSimpleBlockItem("classic_hcz_wall_middle", ModBlocks.classic_hcz_wall_middle);
    public static final DeferredItem<BlockItem> classic_hcz_wall_middle_bloody = ITEMS.registerSimpleBlockItem("classic_hcz_wall_middle_bloody", ModBlocks.classic_hcz_wall_middle_bloody);
    public static final DeferredItem<BlockItem> classic_hcz_wall_top = ITEMS.registerSimpleBlockItem("classic_hcz_wall_top", ModBlocks.classic_hcz_wall_top);
    public static final DeferredItem<BlockItem> classic_lcz_floor1 = ITEMS.registerSimpleBlockItem("classic_lcz_floor1", ModBlocks.classic_lcz_floor1);
    public static final DeferredItem<BlockItem> classic_lcz_floor2 = ITEMS.registerSimpleBlockItem("classic_lcz_floor2", ModBlocks.classic_lcz_floor2);
    public static final DeferredItem<BlockItem> classic_lcz_wall_bottom = ITEMS.registerSimpleBlockItem("classic_lcz_wall_bottom", ModBlocks.classic_lcz_wall_bottom);
    public static final DeferredItem<BlockItem> classic_lcz_wall_middle1 = ITEMS.registerSimpleBlockItem("classic_lcz_wall_middle1", ModBlocks.classic_lcz_wall_middle1);
    public static final DeferredItem<BlockItem> classic_lcz_wall_middle1_bloody = ITEMS.registerSimpleBlockItem("classic_lcz_wall_middle1_bloody", ModBlocks.classic_lcz_wall_middle1_bloody);
    public static final DeferredItem<BlockItem> classic_lcz_wall_middle2 = ITEMS.registerSimpleBlockItem("classic_lcz_wall_middle2", ModBlocks.classic_lcz_wall_middle2);
    public static final DeferredItem<BlockItem> classic_lcz_wall_top = ITEMS.registerSimpleBlockItem("classic_lcz_wall_top", ModBlocks.classic_lcz_wall_top);
    public static final DeferredItem<BlockItem> grate = ITEMS.registerSimpleBlockItem("grate", ModBlocks.grate);
    public static final DeferredItem<BlockItem> cabinet = ITEMS.registerSimpleBlockItem("cabinet", ModBlocks.cabinet);
    public static final DeferredItem<BlockItem> door1 = ITEMS.registerSimpleBlockItem("door1", ModBlocks.door1);
}
