package net.killarexe.enchantment_expansion;

import net.killarexe.enchantment_expansion.core.init.EEEnchantments;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EEMod.MODID)
public class EEMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "enchantment_expansion";
    public static final String VERSION = "0.1a";

    public EEMod(){
        LOGGER.info("Init Enchantment Expansion!");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EEEnchantments.ENCHANTMENTS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Init Enchantment Expansion Complete!");
    }
}
