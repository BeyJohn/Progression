package com.beyjohn.block;

import com.beyjohn.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TungstenOre extends Block
{
	public static String name = "tungstenOre";
	public TungstenOre() 
	{
		super(Material.rock);
		this.setBlockName(RefStrings.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID+":"+name);
		this.setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(6.0f);
		GameRegistry.registerBlock(this, name);
	}
}
