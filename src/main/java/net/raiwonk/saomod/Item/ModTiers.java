package net.raiwonk.saomod.Item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    NIGHT_SKY (8, 4000, 5.0F, 4.0F, 30, () -> Ingredient.of(ModItems.NIGHT_SKY_CRYSTAL.get())
    ),
    BLUE_ROSE (4, 2000, 9.0F, 4.0F, 30, () -> Ingredient.of(ModItems.BLUE_ROSE_CRYSTAL.get())
    );



    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredientSupplier;

    ModTiers(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Supplier<Ingredient> repairIngredientSupplier) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredientSupplier.get();
    }

}