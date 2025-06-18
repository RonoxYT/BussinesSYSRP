/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package crazyinc.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import crazyinc.client.gui.CrazyCreateBussinessScreen;
import crazyinc.client.gui.CrazyBusinessScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CrazyincModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CrazyincModMenus.CRAZY_BUSINESS.get(), CrazyBusinessScreen::new);
		event.register(CrazyincModMenus.CRAZY_CREATE_BUSSINESS.get(), CrazyCreateBussinessScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}