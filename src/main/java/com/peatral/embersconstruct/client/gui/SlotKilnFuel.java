package com.peatral.embersconstruct.client.gui;

import com.peatral.embersconstruct.common.tileentity.TileEntityKiln;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotKilnFuel extends Slot {
    public SlotKilnFuel(IInventory inventoryIn, int slotIndex, int xPosition, int yPosition) {
        super(inventoryIn, slotIndex, xPosition, yPosition);
    }
    public boolean isItemValid(ItemStack stack) {
        return TileEntityKiln.isItemFuel(stack);
    }

    public int getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }
}