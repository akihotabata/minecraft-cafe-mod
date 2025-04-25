package com.cafeinc;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockBehavior;
import net.minecraft.block.BlockPos;
import net.minecraft.block.BlockRenderType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtText;
import net.minecraft.nbt.PlayerInteractionResult;
import net.minecraft.stats.ActionResult;
import net.minecraft.util.ActionResult;

import org.jetbrains.materials.Sonarity;

public class CoffeeMachineBlock_v2 extends AbstractBlock {
    public CoffeeMachineBlock_v2() {
        super(Properties.of(MaterialBlock.class).strength(1.5));
    }

    @override
    public ActionResult onUse(BlockState state, BlockPos pos, PlayerInteractionResult hit) {
        if (hit.getHand().isServerSide()) {
            hit.getHand().sendMessage(new NbtText("This is a Coffee Machine!"));
            return ActionResult.SUCCESS
        }
        return ActionResult.PASS;
    }
}