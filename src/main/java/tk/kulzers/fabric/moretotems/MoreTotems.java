package tk.kulzers.fabric.moretotems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class MoreTotems implements ModInitializer {
    public static final String modid = "moretotems";
	public static final Item SLIMY_TOTEM = new Item(new FabricItemSettings().maxCount(1));
	public static final Item BLAZING_TOTEM = new Item(new FabricItemSettings().maxCount(1));
	public static final Item DOUBLE_BLAZEROD = new Item(new FabricItemSettings().maxCount(1));
	public static final Item ROTTEN_TOTEM = new Item(new FabricItemSettings().maxCount(1));
	public static final ItemGroup GROUP = FabricItemGroupBuilder.create(new Identifier(modid, "group"))
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
		Registry.register(Registry.ITEM, new Identifier(modid, "slimy_totem"), SLIMY_TOTEM);
		Registry.register(Registry.ITEM, new Identifier(modid, "blazing_totem"), BLAZING_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(modid, "double_blaze_rods"), DOUBLE_BLAZEROD);
        Registry.register(Registry.ITEM, new Identifier(modid, "rotten_totem"), ROTTEN_TOTEM);
	}
}
