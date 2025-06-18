package crazyinc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import crazyinc.world.inventory.CrazyBusinessMenu;

import crazyinc.procedures.ReturnType5Procedure;
import crazyinc.procedures.ReturnType4Procedure;
import crazyinc.procedures.ReturnType3Procedure;
import crazyinc.procedures.ReturnType2Procedure;
import crazyinc.procedures.ReturnType1Procedure;
import crazyinc.procedures.ReturnPlayerProcedure;
import crazyinc.procedures.ReturnPlayer5Procedure;
import crazyinc.procedures.ReturnPlayer4Procedure;
import crazyinc.procedures.ReturnPlayer3Procedure;
import crazyinc.procedures.ReturnPlayer2Procedure;
import crazyinc.procedures.ReturnPhone5Procedure;
import crazyinc.procedures.ReturnPhone4Procedure;
import crazyinc.procedures.ReturnPhone3Procedure;
import crazyinc.procedures.ReturnPhone2Procedure;
import crazyinc.procedures.ReturnPhone1Procedure;
import crazyinc.procedures.ReturnName5Procedure;
import crazyinc.procedures.ReturnName4Procedure;
import crazyinc.procedures.ReturnName3Procedure;
import crazyinc.procedures.ReturnName2Procedure;
import crazyinc.procedures.ReturnName1Procedure;

import crazyinc.init.CrazyincModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class CrazyBusinessScreen extends AbstractContainerScreen<CrazyBusinessMenu> implements CrazyincModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public CrazyBusinessScreen(CrazyBusinessMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 183;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/listeentreprisv2.png"), this.leftPos + -57, this.topPos + -25, 0, 0, 301, 233, 301, 233);
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/sheitan.png"), this.leftPos + -1, this.topPos + -8, 0, 0, 10, 10, 10, 10);
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/sheitan.png"), this.leftPos + -1, this.topPos + 29, 0, 0, 10, 10, 10, 10);
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/sheitan.png"), this.leftPos + -1, this.topPos + 66, 0, 0, 10, 10, 10, 10);
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/sheitan.png"), this.leftPos + -1, this.topPos + 101, 0, 0, 10, 10, 10, 10);
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/sheitan.png"), this.leftPos + -1, this.topPos + 137, 0, 0, 10, 10, 10, 10);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_business.label_empty"), 7, 0, -1, false);
		guiGraphics.drawString(this.font, ReturnName1Procedure.execute(world), 4, 8, -3355444, false);
		guiGraphics.drawString(this.font, ReturnType1Procedure.execute(world), 95, 8, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPhone1Procedure.execute(world), 176, 8, -3355444, false);
		guiGraphics.drawString(this.font, ReturnName2Procedure.execute(world), 4, 45, -3355444, false);
		guiGraphics.drawString(this.font, ReturnType2Procedure.execute(world), 95, 45, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPhone2Procedure.execute(world), 176, 45, -3355444, false);
		guiGraphics.drawString(this.font, ReturnName3Procedure.execute(world), 4, 81, -3355444, false);
		guiGraphics.drawString(this.font, ReturnType3Procedure.execute(world), 95, 82, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPhone3Procedure.execute(world), 176, 82, -3355444, false);
		guiGraphics.drawString(this.font, ReturnName4Procedure.execute(world), 4, 117, -3355444, false);
		guiGraphics.drawString(this.font, ReturnType4Procedure.execute(world), 95, 118, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPhone4Procedure.execute(world), 176, 119, -3355444, false);
		guiGraphics.drawString(this.font, ReturnName5Procedure.execute(world), 4, 152, -3355444, false);
		guiGraphics.drawString(this.font, ReturnType5Procedure.execute(world), 95, 153, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPhone5Procedure.execute(world), 176, 154, -3355444, false);
		guiGraphics.drawString(this.font, ReturnPlayerProcedure.execute(world), 13, -8, -3342337, false);
		guiGraphics.drawString(this.font, ReturnPlayer2Procedure.execute(world), 13, 29, -3342337, false);
		guiGraphics.drawString(this.font, ReturnPlayer3Procedure.execute(world), 13, 66, -3342337, false);
		guiGraphics.drawString(this.font, ReturnPlayer4Procedure.execute(world), 13, 101, -3342337, false);
		guiGraphics.drawString(this.font, ReturnPlayer5Procedure.execute(world), 13, 137, -3342337, false);
	}

	@Override
	public void init() {
		super.init();
	}
}