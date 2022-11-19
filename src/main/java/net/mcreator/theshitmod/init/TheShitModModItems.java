
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theshitmod.item.MilkbottleItem;
import net.mcreator.theshitmod.item.BabyItem;
import net.mcreator.theshitmod.TheShitModMod;

public class TheShitModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheShitModMod.MODID);
	public static final RegistryObject<Item> BABY = REGISTRY.register("baby", () -> new BabyItem());
	public static final RegistryObject<Item> MILKBOTTLE = REGISTRY.register("milkbottle", () -> new MilkbottleItem());
}
