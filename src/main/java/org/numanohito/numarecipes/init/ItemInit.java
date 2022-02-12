package org.numanohito.numarecipes.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.numanohito.numarecipes.NumaItems;
import org.numanohito.numarecipes.materials.PanToolMaterial;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NumaItems.modid);

    public static final Tier PAN_TOOL_MATERIAL = new PanToolMaterial();

    public static final RegistryObject<Item> IRON_PAN = ITEMS.register("iron_pan", () ->
            new SwordItem(PAN_TOOL_MATERIAL, 5, -2.4f, new Item.Properties().tab(NumaItems.numaitems)));
}
