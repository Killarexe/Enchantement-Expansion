package net.killarexe.enchantment_expansion.common.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class RandomEffect extends Enchantment {

    public RandomEffect() {
        super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, EquipmentSlot.values());
    }

    @Override
    public void doPostAttack(LivingEntity livingEntity, Entity entity, int p_44688_) {

    }
}
