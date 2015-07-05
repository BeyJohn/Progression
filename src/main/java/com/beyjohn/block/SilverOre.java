package com.beyjohn.block;

import com.beyjohn.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block
{
	public static String name = "silverOre";
	public SilverOre() 
	{
		super(Material.rock);
		this.setBlockName(RefStrings.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID+":"+name);
		this.setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0f);
		GameRegistry.registerBlock(this, name);
	}

}
