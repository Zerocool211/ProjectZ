package com.zerocool211.projectz.items;

import net.minecraft.item.ItemStack;

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

}
