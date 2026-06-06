package dev.celestiacraft.star_chaser.common.tool;

import dev.celestiacraft.star_chaser.StarChaser;
import dev.celestiacraft.star_chaser.tag.SCBlockTag;
import dev.celestiacraft.star_chaser.tag.SCItemTag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class SCToolTiers {
	public static final Tier FLINT;

	static {
		FLINT = TierSortingRegistry.registerTier(
				new ForgeTier(
						1,
						64,
						2.5f,
						0.5f,
						15,
						SCBlockTag.NEED_FLINT_TOOLS,
						() -> Ingredient.of(SCItemTag.FLINTS)
				),
				StarChaser.loadResource("flint"),
				List.of(Tiers.WOOD),
				List.of(Tiers.STONE)
		);
	}
}