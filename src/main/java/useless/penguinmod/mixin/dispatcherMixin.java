package useless.penguinmod.mixin;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import useless.penguinmod.EntityPenguin;

@Mixin(value = EntityDispatcher.class, remap = false)
public class dispatcherMixin {
    @Shadow
    public static void addMapping(Class<? extends Entity> class1, String s, int i) {
    }

    static {
        addMapping(EntityPenguin.class, "Penguin", 96);
    }
}
