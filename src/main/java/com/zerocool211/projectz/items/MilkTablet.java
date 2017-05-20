package com.zerocool211.projectz.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class MilkTablet extends ModTablet
{

    public MilkTablet(String name)
    {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand)
    {
        //Todo
        return new ActionResult<>(EnumActionResult.SUCCESS, stack);
    }

}
