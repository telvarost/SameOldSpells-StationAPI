package com.github.telvarost.sameoldspells.events.init;

import com.github.telvarost.sameoldspells.block.spell.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

import static net.minecraft.block.Block.*;

public class BlockListener {

    public static Block ARROW_SPELL;
    public static Block DARK_SPELL_CUBE;
    public static Block DARK_SPELL;
    public static Block FIRE_SPELL_CUBE;
    public static Block FIRE_SPELL;
    public static Block GRASS_SPELL_CUBE;
    public static Block GRASS_SPELL;
    public static Block HOLY_SPELL_CUBE;
    public static Block HOLY_SPELL;
    public static Block LIGHT_SPELL_CUBE;
    public static Block LIGHT_SPELL;
    public static Block ROCK_SPELL_CUBE;
    public static Block ROCK_SPELL;
    public static Block WATER_SPELL_CUBE;
    public static Block WATER_SPELL;
    public static Block SPELL_VESSEL;

    @Entrypoint.Namespace
    public static final Namespace NAMESPACE = Null.get();

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {

        ARROW_SPELL        = new ArrowSpell      (Identifier.of(NAMESPACE, "arrow_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "arrow_spell"     );
        DARK_SPELL_CUBE    = new DarkSpellCube   (Identifier.of(NAMESPACE, "dark_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "dark_spell_cube"    );
        DARK_SPELL         = new DarkSpell       (Identifier.of(NAMESPACE, "dark_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "dark_spell"      );
        FIRE_SPELL_CUBE    = new FireSpellCube   (Identifier.of(NAMESPACE, "fire_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "fire_spell_cube"    );
        FIRE_SPELL         = new FireSpell       (Identifier.of(NAMESPACE, "fire_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "fire_spell"      );
        GRASS_SPELL_CUBE   = new GrassSpellCube  (Identifier.of(NAMESPACE, "grass_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "grass_spell_cube"   );
        GRASS_SPELL        = new GrassSpell      (Identifier.of(NAMESPACE, "grass_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "grass_spell"     );
        HOLY_SPELL_CUBE    = new HolySpellCube   (Identifier.of(NAMESPACE, "holy_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "holy_spell_cube"    );
        HOLY_SPELL         = new HolySpell       (Identifier.of(NAMESPACE, "holy_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "holy_spell"      );
        LIGHT_SPELL_CUBE   = new LightSpellCube  (Identifier.of(NAMESPACE, "light_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "light_spell_cube"   );
        LIGHT_SPELL        = new LightSpell      (Identifier.of(NAMESPACE, "light_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "light_spell"     );
        ROCK_SPELL_CUBE    = new RockSpellCube   (Identifier.of(NAMESPACE, "rock_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "rock_spell_cube"    );
        ROCK_SPELL         = new RockSpell       (Identifier.of(NAMESPACE, "rock_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "rock_spell"      );
        WATER_SPELL_CUBE   = new WaterSpellCube  (Identifier.of(NAMESPACE, "water_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(NAMESPACE, "water_spell_cube"   );
        WATER_SPELL        = new WaterSpell      (Identifier.of(NAMESPACE, "water_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "water_spell"     );
        SPELL_VESSEL       = new SpellVessel     (Identifier.of(NAMESPACE, "spell_vessel"      ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(NAMESPACE, "spell_vessel"    );
    }
}

