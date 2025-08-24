package us.minecraftchest2.emberborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import us.minecraftchest2.emberborn.registerers.ItemRegisterer;

public class ModItems {
    //ingots
    public static final Item PEWTER_INGOT = ItemRegisterer.register(
            "pewter_ingot", new Item.Settings().maxCount(64));
    public static final Item TIN_INGOT = ItemRegisterer.register(
            "tin_ingot", new Item.Settings().maxCount(64));
    public static final Item BRONZE_INGOT = ItemRegisterer.register(
            "bronze_ingot", new Item.Settings().maxCount(64));
    public static final Item COPPER_INGOT = ItemRegisterer.register(
            "copper_ingot", new Item.Settings().maxCount(64));
    public static final Item ZINC_INGOT = ItemRegisterer.register(
            "zinc_ingot", new Item.Settings().maxCount(64));
    public static final Item BRASS_INGOT = ItemRegisterer.register(
            "brass_ingot", new Item.Settings().maxCount(64));
    public static final Item STEEL_INGOT = ItemRegisterer.register(
            "steel_ingot", new Item.Settings().maxCount(64));
    public static final Item IRON_INGOT = ItemRegisterer.register(
            "iron_ingot", new Item.Settings().maxCount(64));
    // Viles
    public static final Item BRASS_VILE = ItemRegisterer.register(
            "brass_vile", new Item.Settings().maxCount(64).food(new FoodComponent.Builder()
                    .nutrition(2).saturationModifier(0.5f).alwaysEdible().build(),
                    ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect
                            (new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 20, 1), 1.0f)
                            ).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance
                            (StatusEffects.RESISTANCE, 6 * 20, 1), 1.0f)).build()));
    public static final Item TIN_VILE = ItemRegisterer.register(
            "tin_vile", new Item.Settings().maxCount(64).food(new FoodComponent.Builder()
                    .nutrition(2).saturationModifier(0.5f).alwaysEdible().build(),
                    ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect
                            (new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 20, 1), 1.0f)
                            ).build()));

    public static void intialize() {

    }
}
