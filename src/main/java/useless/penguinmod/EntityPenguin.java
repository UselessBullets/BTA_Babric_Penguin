package useless.penguinmod;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.world.World;

public class EntityPenguin extends EntityAnimal {
    public EntityPenguin(World world) {
        super(world);
        this.skinName = "penguin";
        this.highestSkinVariant = -1;
        this.setSize(0.9f, 0.9f);
    }
}
