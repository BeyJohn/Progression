package com.beyjohn.lib;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item Graphene;
	public static Item Lithium;
	
	public static void init()
	{
		Graphene = new com.beyjohn.item.Graphene();
		Lithium = new com.beyjohn.item.Lithium();
	}
}
