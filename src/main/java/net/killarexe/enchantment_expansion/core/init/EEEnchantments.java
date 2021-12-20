package net.killarexe.enchantment_expansion.core.init;

import net.killarexe.enchantment_expansion.EEMod;
import net.killarexe.enchantment_expansion.common.enchantment.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.*;

public class EEEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EEMod.MODID);

    public static final RegistryObject<Enchantment> BURN_PROTECTTION = createEnchantment("burn_protection", new BurnProtection());
    public static final RegistryObject<Enchantment> NO_EFFECT = createEnchantment("no_effect", new NoEffect());
    public static final RegistryObject<Enchantment> LUCKY = createEnchantment("lucky", new Lucky());
    public static final RegistryObject<Enchantment> UNLUCKY = createEnchantment("unlucky", new Unlucky());
    public static final RegistryObject<Enchantment> RANDOM_EFFECT = createEnchantment("random_effect", new RandomEffect());

    private static RegistryObject<Enchantment> createEnchantment(String name, Enchantment enchantment){
        return ENCHANTMENTS.register(name, () -> enchantment);
    }
}
