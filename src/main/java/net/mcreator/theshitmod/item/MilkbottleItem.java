
package net.mcreator.theshitmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.theshitmod.init.TheShitModModTabs;

import java.util.List;

public class MilkbottleItem extends Item {
	public MilkbottleItem() {
		super(new Item.Properties().tab(TheShitModModTabs.TAB_SHIT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("ammo"));
	}
}
