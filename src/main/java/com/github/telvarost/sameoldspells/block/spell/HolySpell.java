package com.github.telvarost.sameoldspells.block.spell;

import com.github.telvarost.sameoldspells.ClientUtil;
import com.github.telvarost.sameoldspells.Config;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LightningEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class HolySpell extends TemplateBlock {

    public HolySpell(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public boolean isOpaque() {
        return false;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public boolean isSideVisible(BlockView blockView, int x, int y, int z, int side) {
        if (  !Config.config.RENDER_SPELLS_CONFIG.DISABLE_ALL_SPELL_RENDERING
            && Config.config.RENDER_SPELLS_CONFIG.HOLY_SPELL
        ) {
            return true;
        } else {
            return false;
        }
    }

    @Environment(EnvType.CLIENT)
    @Override
    public Box getBoundingBox(World world, int x, int y, int z) {
        if (  !Config.config.RENDER_SPELLS_CONFIG.DISABLE_ALL_SPELL_RENDERING
            && Config.config.RENDER_SPELLS_CONFIG.HOLY_SPELL
        ) {
            return Box.createCached((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)y + this.maxY, (double)z + this.maxZ);
        } else {
            return Box.createCached(0, 0, 0, 0, 0, 0);
        }
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isSolidBlock(BlockView blockView, int x, int y, int z, int i) {
        return false;
    }

    @Override
    public Box getCollisionShape(World world, int x, int y, int z) {
        return null;
    }

    @Override
    public void onEntityCollision(World world, int x, int y, int z, Entity entity) {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            if (ClientUtil.IsParticle(entity)) {
                return;
            }
        }

        if (null != entity) {
            world.setBlock(x, y, z, 0);
            world.method_215(x, y, z, 0);

            /** Summon lightning */
            LightningEntity lightning = new LightningEntity(world, x, y, z);
            world.method_210(lightning);
        }
    }
}