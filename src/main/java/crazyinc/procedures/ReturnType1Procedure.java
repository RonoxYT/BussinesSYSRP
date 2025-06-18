package crazyinc.procedures;

import net.minecraft.world.level.LevelAccessor;

import crazyinc.network.CrazyincModVariables;

public class ReturnType1Procedure {
	public static String execute(LevelAccessor world) {
		return CrazyincModVariables.MapVariables.get(world).BussinesType1;
	}
}