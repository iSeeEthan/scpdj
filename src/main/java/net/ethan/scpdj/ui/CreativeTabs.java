package net.ethan.scpdj.ui;

import net.ethan.scpdj.block.ModBlocks;
import net.ethan.scpdj.item.ModItems;
import net.ethan.scpdj.main.Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SCPDJ_BLOCKS_TAB = CREATIVE_TABS.register("scpdj_blocks_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.classic_hcz_wall_bottom.get()))
                    .title(Component.translatable("creativetab.scpdj_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.exterior_brick_top.get());
                        pOutput.accept(ModBlocks.exterior_brick_middle.get());
                        pOutput.accept(ModBlocks.exterior_brick_bottom.get());
                        pOutput.accept(ModBlocks.white_tiles.get());
                        pOutput.accept(ModBlocks.facility_concrete_gray.get());
                        pOutput.accept(ModBlocks.facility_concrete_lightgray.get());
                        pOutput.accept(ModBlocks.duct.get());
                        pOutput.accept(ModBlocks.floor_wood.get());
                        pOutput.accept(ModBlocks.generic_facility_wall.get());
                        pOutput.accept(ModBlocks.generic_facility_wall_blood.get());
                        pOutput.accept(ModBlocks.generic_facility_wall_cracked.get());
                        pOutput.accept(ModBlocks.reinforced_panel1.get());
                        pOutput.accept(ModBlocks.reinforced_panel2.get());
                        pOutput.accept(ModBlocks.reinforced_panel3.get());
                        pOutput.accept(ModBlocks.rusty_iron_block.get());
                        pOutput.accept(ModBlocks.very_rusty_iron_block.get());
                        pOutput.accept(ModBlocks.steel_block.get());
                        pOutput.accept(ModBlocks.steel_block_darker.get());
                        pOutput.accept(ModBlocks.vent.get());
                        pOutput.accept(ModBlocks.black_wall_bottom.get());
                        pOutput.accept(ModBlocks.black_wall_top.get());
                        pOutput.accept(ModBlocks.blue_wall_bottom.get());
                        pOutput.accept(ModBlocks.blue_wall_top.get());
                        pOutput.accept(ModBlocks.brown_wall_bottom.get());
                        pOutput.accept(ModBlocks.brown_wall_top.get());
                        pOutput.accept(ModBlocks.cyan_wall_bottom.get());
                        pOutput.accept(ModBlocks.cyan_wall_top.get());
                        pOutput.accept(ModBlocks.gray_wall_bottom.get());
                        pOutput.accept(ModBlocks.gray_wall_top.get());
                        pOutput.accept(ModBlocks.green_wall_bottom.get());
                        pOutput.accept(ModBlocks.green_wall_top.get());
                        pOutput.accept(ModBlocks.lightblue_wall_bottom.get());
                        pOutput.accept(ModBlocks.lightblue_wall_top.get());
                        pOutput.accept(ModBlocks.lightgray_wall_bottom.get());
                        pOutput.accept(ModBlocks.lightgray_wall_top.get());
                        pOutput.accept(ModBlocks.lime_wall_bottom.get());
                        pOutput.accept(ModBlocks.lime_wall_top.get());
                        pOutput.accept(ModBlocks.magenta_wall_bottom.get());
                        pOutput.accept(ModBlocks.magenta_wall_top.get());
                        pOutput.accept(ModBlocks.orange_wall_bottom.get());
                        pOutput.accept(ModBlocks.orange_wall_top.get());
                        pOutput.accept(ModBlocks.pink_wall_bottom.get());
                        pOutput.accept(ModBlocks.pink_wall_top.get());
                        pOutput.accept(ModBlocks.purple_wall_bottom.get());
                        pOutput.accept(ModBlocks.purple_wall_top.get());
                        pOutput.accept(ModBlocks.red_wall_bottom.get());
                        pOutput.accept(ModBlocks.red_wall_top.get());
                        pOutput.accept(ModBlocks.yellow_wall_bottom.get());
                        pOutput.accept(ModBlocks.yellow_wall_top.get());
                        pOutput.accept(ModBlocks.black_checkered_tiles.get());
                        pOutput.accept(ModBlocks.red_checkered_tiles.get());
                        pOutput.accept(ModBlocks.dark_tiles.get());
                        pOutput.accept(ModBlocks.classic_hcz_wall_bottom.get());
                        pOutput.accept(ModBlocks.classic_hcz_wall_middle.get());
                        pOutput.accept(ModBlocks.classic_hcz_wall_middle_bloody.get());
                        pOutput.accept(ModBlocks.classic_hcz_wall_top.get());
                        pOutput.accept(ModBlocks.classic_lcz_floor1.get());
                        pOutput.accept(ModBlocks.classic_lcz_floor2.get());
                        pOutput.accept(ModBlocks.classic_lcz_wall_bottom.get());
                        pOutput.accept(ModBlocks.classic_lcz_wall_middle1.get());
                        pOutput.accept(ModBlocks.classic_lcz_wall_middle1_bloody.get());
                        pOutput.accept(ModBlocks.classic_lcz_wall_middle2.get());
                        pOutput.accept(ModBlocks.classic_lcz_wall_top.get());
                        pOutput.accept(ModBlocks.grate.get());
                    })
                    .build());
}
