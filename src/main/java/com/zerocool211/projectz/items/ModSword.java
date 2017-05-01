package com.zerocool211.projectz.items;

import com.zerocool211.projectz.ProjectZ;
import com.zerocool211.projectz.common.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ModSword extends ItemSword
{

    public ModSword(ToolMaterial material, String name)
    {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(ProjectZ.tabProjectZ);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        Item repairItem;
        repairItem = new Item();
        if(this == ModItems.fakeDiamondSword)
        {
            repairItem = ModItems.fakeDiamond;
        }
        return repairItem == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}

