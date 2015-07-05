package com.beyjohn.block;

import java.util.Random;

import com.beyjohn.lib.ModItems;
import com.beyjohn.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LithiumOre extends Block
{
	public static String name = "lithiumOre";
	public LithiumOre() 
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
	
	 @Override
     public Item getItemDropped(int metadata, Random random, int fortune) 
	 {
         return ModItems.Lithium;
     }
     //Sets the quantity dropped. it ranges from 4 to 1  
     public int quantityDropped(Random par1Random)
     {
         return par1Random.nextInt(4) + 1;
     }
}
