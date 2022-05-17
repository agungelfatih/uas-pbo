package enemies.structures;

import enemies.Enemy;

public class Wood extends Structure implements Enemy {
    public Wood() {
        super(2, 1, "brown");
    }

    @Override
    public void gotAttacked(int damage) {
        if (super.getHp() < 1) {
            System.out.println("[Stucture]Kayu Hancur!");
        } else {
            int currentHp = super.getHp();
            super.setHp(currentHp - damage);
        }
    }
}
