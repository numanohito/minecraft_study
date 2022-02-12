package org.numanohito.numarecipes.groups;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class MITab extends CreativeModeTab {
    public MITab() {
        super("numaitems");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.IRON_INGOT);
    }
}
