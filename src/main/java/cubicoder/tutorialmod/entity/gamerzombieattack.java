package cubicoder.tutorialmod.entity;

import cubicoder.tutorialmod.entity.gamerzombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class gamerzombieattack extends EntityAIAttackMelee{
        private int raiseArmTicks;
        private gamerzombie gamerZombie;

        public gamerzombieattack(gamerzombie zombieIn, double speedIn, boolean longMemoryIn) {
            super(zombieIn, speedIn, longMemoryIn);
            this.gamerZombie = zombieIn;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        @Override
        public void startExecuting() {
            super.startExecuting();
            this.raiseArmTicks = 0;
        }

        /**
         * Resets the task
         */
        @Override
        public void resetTask() {
            super.resetTask();
            this.gamerZombie.setArmsRaised(false);
        }

        /**
         * Updates the task
         */
        @Override
        public void updateTask() {
            super.updateTask();
            ++this.raiseArmTicks;

            if (this.raiseArmTicks >= 5 && this.attackTick < 10) {
                this.gamerZombie.setArmsRaised(true);
            } else {
                this.gamerZombie.setArmsRaised(false);
            }{

            }}
}