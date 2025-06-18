package crazyinc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

import crazyinc.world.inventory.CrazyCreateBussinessMenu;

import crazyinc.network.CrazyincModVariables;

public class OpenCrazyCreatebusinessGUIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
			_vars.LOGICERRORVIEW = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
			_vars.LOGICERROSTACKS = false;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			_ent.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("CrazyCreateBussiness");
				}

				@Override
				public boolean shouldTriggerClientSideContainerClosingOnOpen() {
					return false;
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new CrazyCreateBussinessMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
	}
}