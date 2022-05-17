package allies.birds;

import allies.Ally;
import enemies.Pig;

public class Bomb extends Bird implements Ally {
    public Bomb(String name) {
        super(name, "Black", "BOOOOOOOOOOOOOMB!!!");
    }

    @Override
    public void attack(Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s dengan Special Ability: %s!\n", super.getName(), target.getName(), super.getAbility());
    }
}
