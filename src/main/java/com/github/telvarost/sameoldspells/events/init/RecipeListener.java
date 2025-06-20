package com.github.telvarost.sameoldspells.events.init;

import com.github.telvarost.sameoldspells.Config;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.ArrayList;
import java.util.Collections;

import static com.github.telvarost.sameoldspells.events.init.BlockListener.*;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            if (Config.config.RECIPES_CONFIG.enableSpellRecipes) {
                CraftingRegistry.addShapedRecipe(new ItemStack(SPELL_VESSEL.asItem(), 1), " X ", "XYX", " X ", 'X', Block.SNOW_BLOCK, 'Y', Item.GLOWSTONE_DUST);
                CraftingRegistry.addShapedRecipe(new ItemStack(ARROW_SPELL.asItem(), 1), " X ", "XYX", " X ", 'X', Item.ARROW, 'Y', new ItemStack(SPELL_VESSEL.asItem()));
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            if (Config.config.RECIPES_CONFIG.enableSpellRecipes) {
                if (Config.config.RECIPES_CONFIG.enableFireCrafting) {
                    CraftingRegistry.addShapelessRecipe(new ItemStack(Block.FIRE.asItem() , 3) , Item.FLINT_AND_STEEL);
                }

                if (Config.config.RECIPES_CONFIG.enableIceCrafting) {
                    CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem() , 1) , Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET);
                    CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem() , 2) , Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET);
                    CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem() , 3) , Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET);
                }

                if (Config.config.RECIPES_CONFIG.fireSpellUsesFlintAndSteel) {
                    for (int i = 1; i <= 3; i++) {
                        var vessels = new ArrayList<Object>(Collections.nCopies(i, SPELL_VESSEL));
                        vessels.add(Item.FLINT_AND_STEEL);
                        CraftingRegistry.addShapelessRecipe(new ItemStack(FIRE_SPELL.asItem(), i), vessels.toArray());
                    }
                } else {
                    CraftingRegistry.addShapelessRecipe(new ItemStack(FIRE_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.FIRE);
                }

                if (Config.config.RECIPES_CONFIG.iceSpellUsesSnowAndWater) {
                    CraftingRegistry.addShapelessRecipe(new ItemStack(ICE_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET);
                } else {
                    CraftingRegistry.addShapelessRecipe(new ItemStack(ICE_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.ICE);
                }

                CraftingRegistry.addShapelessRecipe(new ItemStack(DARK_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.OBSIDIAN);
                CraftingRegistry.addShapelessRecipe(new ItemStack(LIGHT_SPELL.asItem(), 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.GLOWSTONE);
                CraftingRegistry.addShapelessRecipe(new ItemStack(ROCK_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.IRON_BLOCK);
                CraftingRegistry.addShapelessRecipe(new ItemStack(WATER_SPELL.asItem(), 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.LAPIS_BLOCK);
                CraftingRegistry.addShapelessRecipe(new ItemStack(GRASS_SPELL.asItem(), 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.DANDELION);
                CraftingRegistry.addShapelessRecipe(new ItemStack(HOLY_SPELL.asItem() , 1) , new ItemStack(SPELL_VESSEL.asItem(), 1), Block.BOOKSHELF);
            }
        }
    }
}