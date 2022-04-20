
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oldschoolshanghai.init;

import oldschoolshanghai.block.OSSConcreteRoad1Block;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OldschoolshanghaiModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block OSS_CONCRETE_ROAD_1 = register(new OSSConcreteRoad1Block());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
