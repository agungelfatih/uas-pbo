package allies.birds;

import allies.Ally;
import enemies.Pig;

public class TheBlues extends Bird implements Ally {
    public TheBlues(String name) {
        super(name, "blue", "Boboiboy Pecah Tige!!!");
    }

    @Override
    public void attack(Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s dengan Special Ability: %s!\n", super.getName(), target.getName(), super.getAbility());
    }
}
