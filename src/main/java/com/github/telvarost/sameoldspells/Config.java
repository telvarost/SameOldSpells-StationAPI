package com.github.telvarost.sameoldspells;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "SameOldSpells")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigCategory("Render Spell Blocks Config")
        @Comment("Reload world for changes to take effect")
        public RenderSpellBlocksConfig RENDER_SPELLS_CONFIG = new RenderSpellBlocksConfig();

        @ConfigName("Enable Spell Recipes")
        @Comment("Restart required for changes to take effect")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableSpellRecipes = true;
    }

    public static class RenderSpellBlocksConfig {
        @ConfigName("Disable All Spell Block Rendering")
        @Comment("Overrides individual toggles when true")
        public Boolean DISABLE_ALL_SPELL_RENDERING = false;

        @ConfigName("Render Arrow Spell")
        public Boolean ARROW_SPELL = true;

        @ConfigName("Render Dark Block")
        public Boolean DARK_SPELL_CUBE = true;

        @ConfigName("Render Dark Spell")
        public Boolean DARK_SPELL = true;

        @ConfigName("Render Fire Block")
        public Boolean FIRE_SPELL_CUBE = true;

        @ConfigName("Render Fire Spell")
        public Boolean FIRE_SPELL = true;

        @ConfigName("Render Grass Block")
        public Boolean GRASS_SPELL_CUBE= true;

        @ConfigName("Render Grass Spell")
        public Boolean GRASS_SPELL= true;

        @ConfigName("Render Holy Block")
        public Boolean HOLY_SPELL_CUBE = true;

        @ConfigName("Render Holy Spell")
        public Boolean HOLY_SPELL = true;

        @ConfigName("Render Light Block")
        public Boolean LIGHT_SPELL_CUBE= true;

        @ConfigName("Render Light Spell")
        public Boolean LIGHT_SPELL= true;

        @ConfigName("Render Rock Block")
        public Boolean ROCK_SPELL_CUBE = true;

        @ConfigName("Render Rock Spell")
        public Boolean ROCK_SPELL = true;

        @ConfigName("Render Water Block")
        public Boolean WATER_SPELL_CUBE= true;

        @ConfigName("Render Water Spell")
        public Boolean WATER_SPELL= true;

        @ConfigName("Render Spell Vessel")
        public Boolean SPELL_VESSEL = true;
    }
}
