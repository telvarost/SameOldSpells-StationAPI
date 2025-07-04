package com.github.telvarost.sameoldspells.events.init;

import com.github.telvarost.sameoldspells.ModHelper;
import com.github.telvarost.sameoldspells.block.spell.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.util.Identifier;

import static net.minecraft.block.Block.*;

public class BlockListener {

    public static Block[] blocks;
    public static Block ARROW_SPELL;
    public static Block DARK_SPELL_CUBE;
    public static Block DARK_SPELL;
    public static Block FIRE_SPELL_CUBE;
    public static Block FIRE_SPELL;
    public static Block GRASS_SPELL_CUBE;
    public static Block GRASS_SPELL;
    public static Block HOLY_SPELL_CUBE;
    public static Block HOLY_SPELL;
    public static Block ICE_SPELL_CUBE;
    public static Block ICE_SPELL;
    public static Block LIGHT_SPELL_CUBE;
    public static Block LIGHT_SPELL;
    public static Block ROCK_SPELL_CUBE;
    public static Block ROCK_SPELL;
    public static Block WATER_SPELL_CUBE;
    public static Block WATER_SPELL;
    public static Block SPELL_VESSEL;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {

        ARROW_SPELL        = new ArrowSpell      (Identifier.of(ModHelper.NAMESPACE, "arrow_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "arrow_spell"     );
        DARK_SPELL_CUBE    = new DarkSpellCube   (Identifier.of(ModHelper.NAMESPACE, "dark_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "dark_spell_cube"    );
        DARK_SPELL         = new DarkSpell       (Identifier.of(ModHelper.NAMESPACE, "dark_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "dark_spell"      );
        FIRE_SPELL_CUBE    = new FireSpellCube   (Identifier.of(ModHelper.NAMESPACE, "fire_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "fire_spell_cube"    );
        FIRE_SPELL         = new FireSpell       (Identifier.of(ModHelper.NAMESPACE, "fire_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "fire_spell"      );
        GRASS_SPELL_CUBE   = new GrassSpellCube  (Identifier.of(ModHelper.NAMESPACE, "grass_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "grass_spell_cube"   );
        GRASS_SPELL        = new GrassSpell      (Identifier.of(ModHelper.NAMESPACE, "grass_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "grass_spell"     );
        HOLY_SPELL_CUBE    = new HolySpellCube   (Identifier.of(ModHelper.NAMESPACE, "holy_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "holy_spell_cube"    );
        HOLY_SPELL         = new HolySpell       (Identifier.of(ModHelper.NAMESPACE, "holy_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "holy_spell"      );
        ICE_SPELL_CUBE     = new IceSpellCube    (Identifier.of(ModHelper.NAMESPACE, "ice_spell_cube"    ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "ice_spell_cube"     );
        ICE_SPELL          = new IceSpell        (Identifier.of(ModHelper.NAMESPACE, "ice_spell"         ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "ice_spell"       );
        LIGHT_SPELL_CUBE   = new LightSpellCube  (Identifier.of(ModHelper.NAMESPACE, "light_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "light_spell_cube"   );
        LIGHT_SPELL        = new LightSpell      (Identifier.of(ModHelper.NAMESPACE, "light_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "light_spell"     );
        ROCK_SPELL_CUBE    = new RockSpellCube   (Identifier.of(ModHelper.NAMESPACE, "rock_spell_cube"   ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "rock_spell_cube"    );
        ROCK_SPELL         = new RockSpell       (Identifier.of(ModHelper.NAMESPACE, "rock_spell"        ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "rock_spell"      );
        WATER_SPELL_CUBE   = new WaterSpellCube  (Identifier.of(ModHelper.NAMESPACE, "water_spell_cube"  ), Material.GLASS).setHardness(0.25F).setSoundGroup(GLASS_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "water_spell_cube"   );
        WATER_SPELL        = new WaterSpell      (Identifier.of(ModHelper.NAMESPACE, "water_spell"       ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "water_spell"     );
        SPELL_VESSEL       = new SpellVessel     (Identifier.of(ModHelper.NAMESPACE, "spell_vessel"      ), Material.AIR  ).setSoundGroup(WOOL_SOUND_GROUP).setTranslationKey(ModHelper.NAMESPACE, "spell_vessel"    );

        blocks = new Block[]
        {   ARROW_SPELL
        ,   DARK_SPELL_CUBE
        ,   DARK_SPELL
        ,   FIRE_SPELL_CUBE
        ,   FIRE_SPELL
        ,   GRASS_SPELL_CUBE
        ,   GRASS_SPELL
        ,   HOLY_SPELL_CUBE
        ,   HOLY_SPELL
        ,   ICE_SPELL_CUBE
        ,   ICE_SPELL
        ,   LIGHT_SPELL_CUBE
        ,   LIGHT_SPELL
        ,   ROCK_SPELL_CUBE
        ,   ROCK_SPELL
        ,   WATER_SPELL_CUBE
        ,   WATER_SPELL
        ,   SPELL_VESSEL
        };
    }
}

