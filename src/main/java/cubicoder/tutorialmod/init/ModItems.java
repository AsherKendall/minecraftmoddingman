package cubicoder.tutorialmod.init;

import cubicoder.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(TutorialMod.MODID)
public class ModItems {
    @GameRegistry.ObjectHolder("TutorialMod:firstitem")
    public static final Item FIRST_ITEM = null;
    @GameRegistry.ObjectHolder("TutorialMod:tutorialpickaxe")
    public static final Item TUTORIAL_PICKAXE  = null;

}
