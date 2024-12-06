package net.origin.palerealm.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.3f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 40), 0.25f).build();

    public static final FoodProperties STEAMED_KOHLRABI = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.6f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 40), 0.25f).build();

}
