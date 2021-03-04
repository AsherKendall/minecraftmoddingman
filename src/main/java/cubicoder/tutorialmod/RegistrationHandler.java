package cubicoder.tutorialmod;

import cubicoder.tutorialmod.init.ModBlocks;
import cubicoder.tutorialmod.item.ItemTutorialPickaxe;
import cubicoder.tutorialmod.materials.TutorialMaterials;
import cubicoder.tutorialmod.util.RegistryUtil;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;


@EventBusSubscriber(value = Side.CLIENT, modid = TutorialMod.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(TutorialMod.TUTORIAL_TAB),
                RegistryUtil.setItemName(new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL), "tutorial_pickaxe").setCreativeTab(TutorialMod.TUTORIAL_TAB),
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                RegistryUtil.setBlockName(new Block(Material.ROCK), "first_block").setCreativeTab(TutorialMod.TUTORIAL_TAB)
        };

        event.getRegistry().registerAll(blocks);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
