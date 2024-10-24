package kaisoneo.endreimagined.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.BlockPos;

import kaisoneo.endreimagined.init.EndReimaginedModBlockEntities;

public class PearSaplingBlockEntity extends BlockEntity {
	public PearSaplingBlockEntity(BlockPos pos, BlockState state) {
		super(EndReimaginedModBlockEntities.PEAR_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag(HolderLookup.Provider lookupProvider) {
		return this.saveWithFullMetadata(lookupProvider);
	}
}
