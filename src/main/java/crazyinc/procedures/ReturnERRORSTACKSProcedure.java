package crazyinc.procedures;

import net.minecraft.world.entity.Entity;

import crazyinc.network.CrazyincModVariables;

public class ReturnERRORSTACKSProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(CrazyincModVariables.PLAYER_VARIABLES).LOGICERROSTACKS;
	}
}