package org.numanohito.numarecipes;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.numanohito.numarecipes.groups.MITab;
import org.numanohito.numarecipes.init.ItemInit;

@Mod("numaitems")
public class NumaItems {
    public static final String modid = "numaitems";
    public static final CreativeModeTab numaitems = new MITab();

    public NumaItems() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
}
