package net.killarexe.enchantment_expansion.common.enchantment;

import net.killarexe.enchantment_expansion.core.init.EEEnchantments;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class NoEffect extends Enchantment {
    public NoEffect() {
        super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_HEAD, EquipmentSlot.values());
    }

    @Override
    protected boolean checkCompatibility(Enchantment p_44690_) {
        return super.checkCompatibility(p_44690_) && p_44690_ != EEEnchantments.UNLUCKY.get() && p_44690_ != EEEnchantments.LUCKY.get();
    }

    @Override
    public void doPostAttack(LivingEntity p_44686_, Entity p_44687_, int p_44688_) {
        p_44686_.removeAllEffects();
    }

    @Override
    public void doPostHurt(LivingEntity p_44692_, Entity p_44693_, int p_44694_) {
        p_44692_.removeAllEffects();
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
