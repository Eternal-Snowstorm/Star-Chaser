package dev.celestiacraft.star_chaser.tag;

import dev.celestiacraft.libs.tags.TagsBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SCItemTag {
	public static final TagKey<Item> FLINTS;

	static {
		FLINTS = TagsBuilder.item("flints").forge();
	}
}