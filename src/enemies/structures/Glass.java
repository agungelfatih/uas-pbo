package enemies.structures;

import enemies.Enemy;

public class Glass extends Structure implements Enemy {

    public Glass() {
        super(1, 1, "blue");
    }

    @Override
    public void gotAttacked(int damage) {
        if (super.getHp() < 1) {
            System.out.println("[Stucture]Kaca Hancur!");
        } else {
            int currentHp = super.getHp();
            super.setHp(currentHp - damage);
        }
    }
}
