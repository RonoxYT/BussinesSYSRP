package crazyinc.procedures;

import net.minecraft.world.entity.Entity;

import crazyinc.network.CrazyincModVariables;

public class TesteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
			_vars.BussinesCreate = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}