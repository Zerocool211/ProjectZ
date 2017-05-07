package com.zerocool211.projectz.event;

import com.zerocool211.projectz.common.ModItems;
import com.zerocool211.projectz.items.ModTablet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class ModEventHandler
{

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event)
    {
        //todo
    }

    @SubscribeEvent
    public void livingHurt(LivingHurtEvent event)
    {
        //todo
    }

    @SubscribeEvent
    public void itemPickup(PlayerEvent.ItemPickupEvent event)
    {
        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.COBBLESTONE)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if (inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.fakeDiamond)) && inventory.hasItemStack(new ItemStack(Items.COAL)) && !event.player.isSneaking() || inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.fakeDiamond)) && !event.player.isSneaking() && event.player.isCreative())
            {
                if(!event.player.isCreative())
                {
                    //todo
                }
                removeItem(event.player, new ItemStack(Blocks.COBBLESTONE));
            }
        }
    }

    public void removeItem(EntityPlayer ep, ItemStack removeitem)
    {
        IInventory inv = ep.inventory;
        for(int i=0; i < inv.getSizeInventory(); i++)
        {
            if(inv.getStackInSlot(i) != null)
            {
                ItemStack j = inv.getStackInSlot(i);
                if(j.getItem() != null && j.getItem() == removeitem.getItem())
                {
                    inv.setInventorySlotContents(i, null);
                }
            }
        }
    }

    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent event)
    {
        //if(event.getEntity() instanceof EntityPlayer)
        //{
            //EntityPlayer player = (EntityPlayer) event.getEntity();
            //if(player.getHeldItemMainhand() != null)
            //{
                //if(player.inventory.hasItemStack(new ItemStack(Items.COAL)))
                //{
                    //ModTablet.tabletEffect = true;
                //}
                //if(!player.inventory.hasItemStack(new ItemStack(Items.COAL)))
                //{
                    //ModTablet.tabletEffect = false;
                //}
            //}

        //}
    }

    @SubscribeEvent
    public void itemTooltip(ItemTooltipEvent event)
    {
        //todo
    }

    @SubscribeEvent
    public void blockBreak(BlockEvent.BreakEvent event)
    {
        //todo
    }

    @SubscribeEvent
    public void onPlayerPickupXP(PlayerPickupXpEvent event)
    {
        //todo
    }

}
