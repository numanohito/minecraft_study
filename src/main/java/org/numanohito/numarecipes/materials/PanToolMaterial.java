package org.numanohito.numarecipes.materials;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class PanToolMaterial implements Tier {
    private static final int miningLevel = 2;
    private static final int durability = 250;
    private static final double miningSpeed = 6.0F;
    private static final double attackDamage = 2.0F;
    private static final int enchantability = 14;

    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return (float) miningSpeed;
    }

    @Override
    public float getAttackDamageBonus() {
        return (float) attackDamage;
    }

    @Override
    public int getLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return (enchantability);
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Tags.Items.OBSIDIAN);
    }
}
