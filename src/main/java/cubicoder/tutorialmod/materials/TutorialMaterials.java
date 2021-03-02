package cubicoder.tutorialmod.materials;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import cubicoder.tutorialmod.TutorialMod;

public class TutorialMaterials {
    public static final Item.ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "tutorial_tool", 2, 625, 7.0F, 2.5F, 10);
}
