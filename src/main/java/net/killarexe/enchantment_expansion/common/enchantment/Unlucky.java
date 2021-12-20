package net.killarexe.enchantment_expansion.common.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Random;

public class Unlucky extends Enchantment {

    public Unlucky() {
        super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_CHEST, EquipmentSlot.values());
    }

    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    public void doPostAttack(LivingEntity livingEntity, Entity entity, int p_44688_) {
        applyRandomEffect(livingEntity);
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
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HARM, time, 1));
                break;
            case 1:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, time, 1));
                break;
            case 2:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, time, 1));
                break;
            case 3:
                livingEntity.setRemainingFireTicks(200);
                break;
            case 4:
                livingEntity.setHealth(5);
                break;
            case 5:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, time, 1));
                break;
            case 6:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, time, 1));
                break;
            case 7:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, time, 1));
                break;
            case 8:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, time, 1));
                break;
            case 9:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, time, 1));
                livingEntity.hurt(DamageSource.MAGIC, 5);
                break;
            case 10:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, time, 1));
                break;
            default:
                livingEntity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, time, 1));
                break;
        }
    }
}
