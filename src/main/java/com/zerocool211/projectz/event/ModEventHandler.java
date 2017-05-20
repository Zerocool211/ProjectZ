package com.zerocool211.projectz.event;

import com.zerocool211.projectz.common.ModItems;
import com.zerocool211.projectz.items.ModTablet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
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
            if (inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.cobblestoneToken)) && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) && !event.player.isSneaking() || inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.cobblestoneToken)) && !event.player.isSneaking() && event.player.isCreative())
            {
                if(!event.player.isCreative())
                {
                    ModTablet.removeFuelItem(event.player);
                }
                removeItem(event.player, new ItemStack(Blocks.COBBLESTONE));
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.STONE, 1, 0)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if (inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.stoneToken)) && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) && !event.player.isSneaking() || inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.stoneToken)) && !event.player.isSneaking() && event.player.isCreative())
            {
                if(!event.player.isCreative())
                {
                    ModTablet.removeFuelItem(event.player);
                }
                removeItem(event.player, new ItemStack(Blocks.STONE, 1, 0));
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.DIRT)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if (inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.dirtToken)) && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) && !event.player.isSneaking() || inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.dirtToken)) && !event.player.isSneaking() && event.player.isCreative())
            {
                if(!event.player.isCreative())
                {
                    ModTablet.removeFuelItem(event.player);
                }
                removeItem(event.player, new ItemStack(Blocks.DIRT));
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.GRAVEL)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if (inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.gravelToken)) && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) && !event.player.isSneaking() || inventory.hasItemStack(new ItemStack(ModItems.destructionTablet)) && inventory.hasItemStack(new ItemStack(ModItems.gravelToken)) && !event.player.isSneaking() && event.player.isCreative())
            {
                if(!event.player.isCreative())
                {
                    ModTablet.removeFuelItem(event.player);
                }
                removeItem(event.player, new ItemStack(Blocks.GRAVEL));
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
        //todo
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
