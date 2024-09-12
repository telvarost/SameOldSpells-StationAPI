package com.github.telvarost.sameoldspells.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabFishinFoodTweaksFish;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabFishinFoodTweaksFish = new SimpleTab(BlockListener.NAMESPACE.id("spell_vessel"), BlockListener.SPELL_VESSEL.asItem());
        event.register(tabFishinFoodTweaksFish);
        for (Block block : BlockListener.blocks){
            tabFishinFoodTweaksFish.addItem(new ItemStack(block.asItem(), 1));
        }
    }
}