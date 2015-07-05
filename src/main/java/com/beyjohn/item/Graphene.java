package com.beyjohn.item;

import com.beyjohn.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Graphene extends Item
{
	public static String name = "graphene";
	public Graphene()
	{
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(RefStrings.MODID + "_" + name);
		this.setTextureName(RefStrings.MODID + ":Graphene");
		GameRegistry.registerItem(this, name);
	}
}
