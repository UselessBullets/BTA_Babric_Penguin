package useless.penguinmod.models;

import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import useless.penguinmod.entities.EntityPenguin;

public class PenguinRenderer
        extends LivingRenderer<EntityPenguin> {
    public PenguinRenderer(ModelBase modelbase, float f) {
        super(modelbase, f);
    }
}
