package com.cafeinc;

import net.minecraft.block.Block;
import net.minecraft.block.MaterialBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Player;

public class CoffeeMachineBlock extends AbstractBlock {

    public CoffeeMachineBlock() {
        super(Properties.of(MaterialBlock.class).strength(1.5));
    }

    /**
     * Called when the player right-clicks the block.
     */
    @verride
    public void onUse(net.minecraft.block.BlockConyext blockContext, Player player) {
        // Todo : open ui for coffee making
    }
}