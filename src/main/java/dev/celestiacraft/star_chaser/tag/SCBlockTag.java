package dev.celestiacraft.star_chaser.tag;

import dev.celestiacraft.libs.tags.TagsBuilder;
import dev.celestiacraft.star_chaser.StarChaser;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SCBlockTag {
	public static final TagKey<Block> NEED_FLINT_TOOLS;

	static {
		NEED_FLINT_TOOLS = TagsBuilder.block("need_flint_tools").namespace(StarChaser.MODID);
	}
}