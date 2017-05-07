package com.zerocool211.projectz.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModTablet extends ModItem
{

    public ModTablet(String name)
    {
        super(name);
        this.setMaxStackSize(1);
    }

    public static boolean tabletEffect = false;

    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return tabletEffect;
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }
    
}
