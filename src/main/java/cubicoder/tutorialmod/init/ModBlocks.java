package cubicoder.tutorialmod.init;

import cubicoder.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(TutorialMod.MODID)
public class ModBlocks {
    @GameRegistry.ObjectHolder("TutorialMod:firstblock")
    public static final Block FIRST_BLOCK = null;
}
