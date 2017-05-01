package com.zerocool211.projectz.common;

import com.zerocool211.projectz.ProjectZ;

import com.zerocool211.projectz.blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{

    public static Block fakeDiamondBlock;

    public static void preInit()
    {
        fakeDiamondBlock = new ModBlock(Material.IRON, "fake_diamond_block");

        registerBlocks();
    }

    public static void registerBlocks()
    {
        registerBlock(fakeDiamondBlock, "fake_diamond_block");
    }

    public static void registerBlock(Block block, String name)
    {
        GameRegistry.register(block, new ResourceLocation(ProjectZ.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(ProjectZ.MODID, name));
    }

    public static void registerRenders()
    {
        registerRender(fakeDiamondBlock);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ProjectZ.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
