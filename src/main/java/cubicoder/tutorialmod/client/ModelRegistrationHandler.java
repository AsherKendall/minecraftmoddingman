package cubicoder.tutorialmod.client;

import cubicoder.tutorialmod.TutorialMod;
import cubicoder.tutorialmod.init.ModBlocks;
import cubicoder.tutorialmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Objects;

@EventBusSubscriber(value = Side.CLIENT, modid = TutorialMod.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.FIRST_ITEM, 0);
        registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK), 0);
        registerModel(ModItems.TUTORIAL_PICKAXE, 0);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

}
