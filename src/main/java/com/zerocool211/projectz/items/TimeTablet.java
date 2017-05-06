package com.zerocool211.projectz.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TimeTablet extends ModItem
{

    public TimeTablet(String name)
    {
        super(name);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(player.inventory.hasItemStack(new ItemStack(Items.COAL)))
        {
            world.setWorldTime(world.getWorldTime() + 1000);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

}
