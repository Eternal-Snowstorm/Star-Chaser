package dev.celestiacraft.star_chaser.compat.kubejs;

import dev.celestiacraft.star_chaser.StarChaser;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;

public class SCKubeJSPlugin extends KubeJSPlugin {
	@Override
	public void registerBindings(BindingsEvent event) {
		event.add("StarChaser", StarChaser.class);
	}
}