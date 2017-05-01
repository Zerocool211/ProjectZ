package com.zerocool211.projectz.items;

import com.zerocool211.projectz.ProjectZ;
import net.minecraft.item.Item;

public class ModItem extends Item
{

    public ModItem(String name)
    {
        setUnlocalizedName(name);
        setCreativeTab(ProjectZ.tabProjectZ);
    }

}
