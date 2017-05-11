package com.zerocool211.projectz.event;

import com.zerocool211.projectz.common.ModItems;
import com.zerocool211.projectz.items.ModTablet;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class ModReverseCraftingHandler
{

    @SubscribeEvent
    public void itemPickup(PlayerEvent.ItemPickupEvent event)
    {
        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.WOOL)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Blocks.WOOL));
                    inventory.addItemStackToInventory(new ItemStack(Items.STRING, 4));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.BOOK)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.BOOK));
                    inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 3));
                    inventory.addItemStackToInventory(new ItemStack(Items.LEATHER, 1));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.COMPASS)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.COMPASS));
                    inventory.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, 4));
                    inventory.addItemStackToInventory(new ItemStack(Items.REDSTONE, 1));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.CLOCK)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.CLOCK));
                    inventory.addItemStackToInventory(new ItemStack(Items.GOLD_INGOT, 4));
                    inventory.addItemStackToInventory(new ItemStack(Items.REDSTONE, 1));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.ITEM_FRAME)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.ITEM_FRAME));
                    inventory.addItemStackToInventory(new ItemStack(Items.STICK, 8));
                    inventory.addItemStackToInventory(new ItemStack(Items.LEATHER, 1));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.BUCKET)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.BUCKET));
                    inventory.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, 3));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Items.MINECART)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Items.MINECART));
                    inventory.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, 5));
                }
            }
        }

        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.STICKY_PISTON)))
        {
            InventoryPlayer inventory = event.player.inventory;
            if(event.player.getHeldItemMainhand() != null)
            {
                if (event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && inventory.hasItemStack(new ItemStack(ModTablet.fuelItem)) ||event.player.getHeldItemMainhand().getItem() == ModItems.reversingTablet && event.player.isCreative())
                {
                    if(!event.player.isCreative())
                    {
                        ModTablet.removeFuelItem(event.player);
                    }
                    ModTablet.removeItem(event.player, new ItemStack(Blocks.STICKY_PISTON));
                    inventory.addItemStackToInventory(new ItemStack(Blocks.PISTON, 1));
                    inventory.addItemStackToInventory(new ItemStack(Items.SLIME_BALL, 1));
                }
            }
        }
    }

}
