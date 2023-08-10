package useless.penguinmod;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.CowRenderer;
import net.minecraft.client.render.model.ModelCow;
import net.minecraft.core.entity.animal.EntityCow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import useless.config.ModMenuConfigManager;

import turniplabs.halplibe.helper.EntityHelper;


public class PenguinMod implements ModInitializer {
    public static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
    public static final String MOD_ID = "penguinmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModMenuConfigManager.initializeConfig();

        EntityHelper.createEntity(EntityCow.class, new CowRenderer(new ModelCow(), 0.7f), 200, "Penguin");

        LOGGER.info("PenguinMod initialized.");
    }
}
