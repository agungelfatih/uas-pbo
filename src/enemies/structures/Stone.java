package enemies.structures;

import enemies.Enemy;

public class Stone extends Structure implements Enemy {
    public Stone() {
        super(3, 1, "grey");
    }

    @Override
    public void gotAttacked(int damage) {
        if (super.getHp() < 1) {
            System.out.println("[Stucture]Batu Hancur!");
        } else {
            int currentHp = super.getHp();
            super.setHp(currentHp - damage);
        }
    }
}
