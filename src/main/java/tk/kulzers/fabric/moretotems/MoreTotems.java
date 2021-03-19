package tk.kulzers.fabric.moretotems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class MoreTotems implements ModInitializer {
	public static final Item ROTTEN_TOTEM = new Item(new FabricItemSettings().maxCount(1));
	public static final ItemGroup GROUP = FabricItemGroupBuilder.create(new Identifier("moretotems", "group"))
			.icon(() -> new ItemStack(ROTTEN_TOTEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ROTTEN_TOTEM));
			})
			.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
