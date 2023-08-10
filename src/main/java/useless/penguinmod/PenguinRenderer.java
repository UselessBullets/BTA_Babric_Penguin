package useless.penguinmod;

import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.entity.animal.EntityPig;

public class PenguinRenderer
        extends LivingRenderer<EntityPenguin> {
    public PenguinRenderer(ModelBase modelbase, ModelBase modelbase1, float f) {
        super(modelbase, f);
        this.setRenderPassModel(modelbase1);
    }

    protected boolean renderSaddledPig(EntityPig entity, int i, float f) {
        this.loadTexture("/mob/saddle.png");
        return i == 0 && entity.getSaddled();
    }

    protected boolean shouldRenderPass(EntityPig entity, int renderPass, float renderPartialTicks) {
        return this.renderSaddledPig(entity, renderPass, renderPartialTicks);
    }
}
