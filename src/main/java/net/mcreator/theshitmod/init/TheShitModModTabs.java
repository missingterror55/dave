
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshitmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheShitModModTabs {
	public static CreativeModeTab TAB_SHIT;

	public static void load() {
		TAB_SHIT = new CreativeModeTab("tabshit") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
