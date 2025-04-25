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

public class CoffeeMachineBlockEnhanced extends AbstractBlock {

    public CoffeeMachineBlockEnhanced() {
        super(Properties.of(MaterialBlock.class).strength(1.5));
    }

    @override
    public ActionResult onUse(BlockState state, BlockPos pos, Player player) {
        if (!player.getLevel().isRemote()) {
            player.notify(new NbtText(Text.content("You run a Coffee Machine!")));
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}