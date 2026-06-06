package dev.celestiacraft.star_chaser.common.tool;

import dev.celestiacraft.libs.api.register.tool.tier.TierBuilder;
import dev.celestiacraft.star_chaser.StarChaser;
import dev.celestiacraft.star_chaser.tag.SCBlockTag;
import dev.celestiacraft.star_chaser.tag.SCItemTag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class SCToolTiers {
	public static final Tier FLINT;

	static {
		FLINT = TierBuilder.create((builder) -> {
			builder.setName(StarChaser.loadResource("flint"))
					.setLevel(1)
					.setUses(64)
					.setSpeed(2.5f)
					.setDamage(0.5f)
					.setEnchantmentValue(15)
					.setMineableTag(SCBlockTag.NEED_FLINT_TOOLS)
					.setRepairIngredient(SCItemTag.FLINTS)
					.setAfter(Tiers.WOOD)
					.setBefore(Tiers.STONE);
		});
	}
}