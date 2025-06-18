package crazyinc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import crazyinc.network.CrazyincModVariables;

import crazyinc.init.CrazyincModMenus;

public class CreateBussineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (false == entity.getData(CrazyincModVariables.PLAYER_VARIABLES).BussinesCreate
				&& false == ((entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "").isEmpty()
				&& false == ((entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "").isEmpty()
				&& false == ((entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "").isEmpty()) {
			if (true == (CrazyincModVariables.MapVariables.get(world).BussinesName1).isEmpty()) {
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.BussinesCreate = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERRORVIEW = false;
					_vars.syncPlayerVariables(entity);
				}
				CrazyincModVariables.MapVariables.get(world).PLAYER = entity.getDisplayName().getString();
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesName1 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesPhone1 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesType1 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else if (true == (CrazyincModVariables.MapVariables.get(world).BussinesName2).isEmpty()) {
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.BussinesCreate = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERRORVIEW = false;
					_vars.syncPlayerVariables(entity);
				}
				CrazyincModVariables.MapVariables.get(world).PLAYER2 = entity.getDisplayName().getString();
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesName2 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesPhone2 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesType2 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else if (true == (CrazyincModVariables.MapVariables.get(world).BussinesName3).isEmpty()) {
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.BussinesCreate = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERRORVIEW = false;
					_vars.syncPlayerVariables(entity);
				}
				CrazyincModVariables.MapVariables.get(world).PLAYER3 = entity.getDisplayName().getString();
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesName3 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesPhone3 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesType3 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else if (true == (CrazyincModVariables.MapVariables.get(world).BussinesName4).isEmpty()) {
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.BussinesCreate = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERRORVIEW = false;
					_vars.syncPlayerVariables(entity);
				}
				CrazyincModVariables.MapVariables.get(world).PLAYER4 = entity.getDisplayName().getString();
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesName4 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesPhone4 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesType4 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else if (true == (CrazyincModVariables.MapVariables.get(world).BussinesName5).isEmpty()) {
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.BussinesCreate = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERRORVIEW = false;
					_vars.syncPlayerVariables(entity);
				}
				CrazyincModVariables.MapVariables.get(world).PLAYER5 = entity.getDisplayName().getString();
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesName5 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessName", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesType5 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "BusinessType", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				CrazyincModVariables.MapVariables.get(world).BussinesPhone5 = (entity instanceof Player _entity && _entity.containerMenu instanceof CrazyincModMenus.MenuAccessor _menu) ? _menu.getMenuState(0, "Phonenumber", "") : "";
				CrazyincModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:correct")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:false")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:false")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
					_vars.LOGICERROSTACKS = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:false")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("crazyinc:false")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				CrazyincModVariables.PlayerVariables _vars = entity.getData(CrazyincModVariables.PLAYER_VARIABLES);
				_vars.LOGICERRORVIEW = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}