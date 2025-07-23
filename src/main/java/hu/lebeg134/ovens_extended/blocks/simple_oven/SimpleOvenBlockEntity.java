package hu.lebeg134.ovens_extended.blocks.simple_oven;

import com.simibubi.create.content.logistics.tunnel.BeltTunnelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;

public class SimpleOvenBlockEntity extends BeltTunnelBlockEntity {


    private LazyOptional<IItemHandler> beltCapability;
    private LazyOptional<IItemHandler> tunnelCapability;

    public SimpleOvenBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
        beltCapability = LazyOptional.empty();
        tunnelCapability = LazyOptional.empty();
    }
}
