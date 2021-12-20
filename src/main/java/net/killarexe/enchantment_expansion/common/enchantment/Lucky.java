package net.killarexe.enchantment_expansion.common.enchantment;

import net.killarexe.enchantment_expansion.core.init.EEEnchantments;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.Random;

public class Lucky extends Enchantment {

    public Lucky() {
        super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_CHEST, EquipmentSlot.values());
    }

    @Override
    public void doPostAttack(LivingEntity livingEntity, Entity entity, int p_44688_) {
        applyRandomEffect(livingEntity);
    }

    @Override
    protected boolean checkCompatibility(Enchantment p_44690_) {
        return super.checkCompatibility(p_44690_) && p_44690_ != EEEnchantments.UNLUCKY.get();
    }

    @Override
    public void doPostHurt(LivingEntity livingEntity, Entity entity, int p_44694_) {
        applyRandomEffect(livingEntity);
    }

    private void applyRandomEffect(LivingEntity livingEntity){
        int random = new Random().nextInt(0, 10);
        int time = new Random().nextInt(20, 1024);
        switch (random){
            case 0:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HEAL, time, 1));
                break;
            case 1:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, time, 1));
                break;
            case 2:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, time, 1));
                break;
            case 3:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, time, 1));
                break;
            case 4:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, time, 1));
                break;
            case 5:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, time, 1));
                break;
            case 6:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, time, 1));
                break;
            case 7:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, time, 1));
                break;
            case 8:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, time, 1));
                break;
            case 9:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, time, 1));
                break;
            case 10:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, time, 1));
                break;
            default:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.LUCK, time, 1));
                break;
        }
    }
}
