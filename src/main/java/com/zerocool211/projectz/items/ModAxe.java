package com.zerocool211.projectz.items;

import com.zerocool211.projectz.ProjectZ;
import com.zerocool211.projectz.common.ModItems;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ModAxe extends ItemAxe
{

    public ModAxe(ToolMaterial material, float damage, float speed, String name)
    {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setCreativeTab(ProjectZ.tabProjectZ);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return ModItems.fakeDiamond == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
