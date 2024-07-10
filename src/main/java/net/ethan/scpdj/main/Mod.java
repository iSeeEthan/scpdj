package net.ethan.scpdj.main;

import net.ethan.scpdj.block.ModBlocks;
import net.ethan.scpdj.ui.CreativeTabs;
import net.ethan.scpdj.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;

@net.neoforged.fml.common.Mod(Mod.MODID)
public class Mod {
    public static final String MODID = "scpdj";

    public Mod(IEventBus modEventBus, ModContainer modContainer)
    {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CreativeTabs.CREATIVE_TABS.register(modEventBus);
    }
}
