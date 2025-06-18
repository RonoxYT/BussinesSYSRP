package crazyinc.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import crazyinc.world.inventory.CrazyCreateBussinessMenu;

import crazyinc.procedures.ReturnfalsortrueERRORProcedure;
import crazyinc.procedures.ReturnERRORSTACKSProcedure;

import crazyinc.network.CrazyCreateBussinessButtonMessage;

import crazyinc.init.CrazyincModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class CrazyCreateBussinessScreen extends AbstractContainerScreen<CrazyCreateBussinessMenu> implements CrazyincModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox BusinessName;
	EditBox BusinessType;
	EditBox Phonenumber;
	Button button_create;

	public CrazyCreateBussinessScreen(CrazyCreateBussinessMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("BusinessName"))
				BusinessName.setValue(stringState);
			else if (name.equals("BusinessType"))
				BusinessType.setValue(stringState);
			else if (name.equals("Phonenumber"))
				Phonenumber.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		BusinessName.render(guiGraphics, mouseX, mouseY, partialTicks);
		BusinessType.render(guiGraphics, mouseX, mouseY, partialTicks);
		Phonenumber.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(ResourceLocation.parse("crazyinc:textures/screens/finale_gui.png"), this.leftPos + -188, this.topPos + -118, 0, 0, 354, 217, 354, 217);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (BusinessName.isFocused())
			return BusinessName.keyPressed(key, b, c);
		if (BusinessType.isFocused())
			return BusinessType.keyPressed(key, b, c);
		if (Phonenumber.isFocused())
			return Phonenumber.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String BusinessNameValue = BusinessName.getValue();
		String BusinessTypeValue = BusinessType.getValue();
		String PhonenumberValue = Phonenumber.getValue();
		super.resize(minecraft, width, height);
		BusinessName.setValue(BusinessNameValue);
		BusinessType.setValue(BusinessTypeValue);
		Phonenumber.setValue(PhonenumberValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_name_bussiness"), -112, -93, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_business_type"), -112, -48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_phone_number"), -112, 61, -12829636, false);
		if (ReturnfalsortrueERRORProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_error_243"), 17, 72, -3407872, false);
		if (ReturnERRORSTACKSProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_error_404"), 17, 72, -6750208, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.crazyinc.crazy_create_bussiness.label_create_an_bussines"), -25, -107, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		BusinessName = new EditBox(this.font, this.leftPos + -111, this.topPos + -73, 118, 18, Component.translatable("gui.crazyinc.crazy_create_bussiness.BusinessName"));
		BusinessName.setMaxLength(8192);
		BusinessName.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "BusinessName", content, false);
		});
		BusinessName.setHint(Component.translatable("gui.crazyinc.crazy_create_bussiness.BusinessName"));
		this.addWidget(this.BusinessName);
		BusinessType = new EditBox(this.font, this.leftPos + -111, this.topPos + -34, 118, 18, Component.translatable("gui.crazyinc.crazy_create_bussiness.BusinessType"));
		BusinessType.setMaxLength(8192);
		BusinessType.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "BusinessType", content, false);
		});
		BusinessType.setHint(Component.translatable("gui.crazyinc.crazy_create_bussiness.BusinessType"));
		this.addWidget(this.BusinessType);
		Phonenumber = new EditBox(this.font, this.leftPos + -111, this.topPos + 73, 118, 18, Component.translatable("gui.crazyinc.crazy_create_bussiness.Phonenumber"));
		Phonenumber.setMaxLength(8192);
		Phonenumber.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Phonenumber", content, false);
		});
		Phonenumber.setHint(Component.translatable("gui.crazyinc.crazy_create_bussiness.Phonenumber"));
		this.addWidget(this.Phonenumber);
		button_create = Button.builder(Component.translatable("gui.crazyinc.crazy_create_bussiness.button_create"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CrazyCreateBussinessButtonMessage(0, x, y, z));
				CrazyCreateBussinessButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 88, this.topPos + 68, 56, 20).build();
		this.addRenderableWidget(button_create);
	}
}