package com.github.telvarost.sameoldspells;

import net.glasslauncher.mods.gcapi3.api.*;

public class Config {

    @ConfigRoot(value = "config", visibleName = "SameOldSpells")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigCategory(
                name = "Render Spell Blocks Config",
                description = "Reload world for changes to take effect"
        )
        public RenderSpellBlocksConfig RENDER_SPELLS_CONFIG = new RenderSpellBlocksConfig();

        @ConfigCategory(
                name = "Mod Recipes Config",
                description = "Restart required for changes to take effect"
        )
        public RecipesConfig RECIPES_CONFIG = new RecipesConfig();
    }

    public static class RecipesConfig {

        @ConfigEntry(
                name = "Enable Spell Recipes",
                description = "Whether spells can be crafted or not",
                multiplayerSynced = true
        )
        public Boolean enableSpellRecipes = true;

        @ConfigEntry(
                name = "Enable Fire Crafting",
                description = "Allows crafting flint and steel into fire",
                multiplayerSynced = true
        )
        public Boolean enableFireCrafting = true;

        @ConfigEntry(
                name = "Enable Ice Crafting",
                description = "Allows crafting snow and water into ice",
                multiplayerSynced = true
        )
        public Boolean enableIceCrafting = true;

        @ConfigEntry(
                name = "Craft Fire Spell With Flint And Steel",
                description = "Fire spell uses fire block by default",
                multiplayerSynced = true
        )
        public Boolean fireSpellUsesFlintAndSteel = false;

        @ConfigEntry(
                name = "Craft Ice Spell With Snow and Water",
                description = "Ice spell uses ice block by default",
                multiplayerSynced = true
        )
        public Boolean iceSpellUsesSnowAndWater = false;
    }

    public static class RenderSpellBlocksConfig {
        @ConfigEntry(
                name = "Disable All Spell Block Rendering",
                description = "Overrides individual toggles when true"
        )
        public Boolean DISABLE_ALL_SPELL_RENDERING = false;

        @ConfigEntry(name = "Render Arrow Spell")
        public Boolean ARROW_SPELL = true;

        @ConfigEntry(name = "Render Dark Spell Cube")
        public Boolean DARK_SPELL_CUBE = true;

        @ConfigEntry(name = "Render Dark Spell")
        public Boolean DARK_SPELL = true;

        @ConfigEntry(name = "Render Fire Spell Cube")
        public Boolean FIRE_SPELL_CUBE = true;

        @ConfigEntry(name = "Render Fire Spell")
        public Boolean FIRE_SPELL = true;

        @ConfigEntry(name = "Render Grass Spell Cube")
        public Boolean GRASS_SPELL_CUBE= true;

        @ConfigEntry(name = "Render Grass Spell")
        public Boolean GRASS_SPELL= true;

        @ConfigEntry(name = "Render Holy Spell Cube")
        public Boolean HOLY_SPELL_CUBE = true;

        @ConfigEntry(name = "Render Holy Spell")
        public Boolean HOLY_SPELL = true;

        @ConfigEntry(name = "Render Ice Spell Cube")
        public Boolean ICE_SPELL_CUBE = true;

        @ConfigEntry(name = "Render Ice Spell")
        public Boolean ICE_SPELL = true;

        @ConfigEntry(name = "Render Light Spell Cube")
        public Boolean LIGHT_SPELL_CUBE= true;

        @ConfigEntry(name = "Render Light Spell")
        public Boolean LIGHT_SPELL= true;

        @ConfigEntry(name = "Render Rock Spell Cube")
        public Boolean ROCK_SPELL_CUBE = true;

        @ConfigEntry(name = "Render Rock Spell")
        public Boolean ROCK_SPELL = true;

        @ConfigEntry(name = "Render Water Spell Cube")
        public Boolean WATER_SPELL_CUBE= true;

        @ConfigEntry(name = "Render Water Spell")
        public Boolean WATER_SPELL= true;

        @ConfigEntry(name = "Render Spell Vessel")
        public Boolean SPELL_VESSEL = true;
    }
}
