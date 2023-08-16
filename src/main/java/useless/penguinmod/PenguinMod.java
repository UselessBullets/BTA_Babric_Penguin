package useless.penguinmod;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.CowRenderer;
import net.minecraft.client.render.entity.CreeperRenderer;
import net.minecraft.client.render.model.ModelCow;
import net.minecraft.client.render.model.ModelCreeper;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.animal.EntityCow;
import net.minecraft.core.entity.monster.EntityCreeper;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import useless.config.ModMenuConfigManager;

import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.mixin.accessors.DispatcherAccessor;


public class PenguinMod implements ModInitializer {
    public static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
    public static final String MOD_ID = "penguinmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //public static final Item coconut = ItemHelper.createItem(MOD_ID, new Item("Coconut", Block.blocksList.length + 3000), "coconut", "coconut.png");


    @Override
    public void onInitialize() {
        ModMenuConfigManager.initializeConfig();
        
        EntityHelper.createEntity(EntityCreeper.class, new CreeperRenderer(), 19000, "Penguin");

        LOGGER.info("PenguinMod initialized.");
    }
}
