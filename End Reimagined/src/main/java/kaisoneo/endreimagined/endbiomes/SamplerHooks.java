package kaisoneo.endreimagined.endbiomes;

import net.minecraft.world.level.levelgen.synth.ImprovedNoise;

public interface SamplerHooks {
	ImprovedNoise getEndBiomesSampler();

	void setSeed(long seed);

	long getSeed();
}
