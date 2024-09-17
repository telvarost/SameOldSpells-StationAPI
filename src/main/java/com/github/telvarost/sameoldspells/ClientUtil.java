package com.github.telvarost.sameoldspells;

import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;

public class ClientUtil {
    public static boolean IsParticle(Entity entity) {
        return entity instanceof Particle;
    }
}
