package com.beyjohn.lib;

import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block LeadOre;
	public static Block SilverOre;
	public static Block CopperOre;
	public static Block TinOre;
	public static Block LithiumOre;
	public static Block TungstenOre;
	public static Block LeadBlock;
	public static Block SilverBlock;
	public static Block CopperBlock;
	public static Block TinBlock;
	public static Block TungstenBlock;
	
	 public static void init()
	 {
		 LeadOre = new com.beyjohn.block.LeadOre();
		 SilverOre = new com.beyjohn.block.SilverOre();
		 CopperOre = new com.beyjohn.block.CopperOre();
		 TinOre = new com.beyjohn.block.TinOre();
		 LithiumOre = new com.beyjohn.block.LithiumOre();
		 TungstenOre = new com.beyjohn.block.TungstenOre();
		 LeadBlock = new com.beyjohn.block.LeadBlock();
		 SilverBlock = new com.beyjohn.block.SilverBlock();
		 CopperBlock = new com.beyjohn.block.CopperBlock();
		 TinBlock = new com.beyjohn.block.TinBlock();
		 TungstenBlock = new com.beyjohn.block.TungstenBlock();
	 }
}
