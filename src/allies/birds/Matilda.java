package allies.birds;

import allies.Ally;
import enemies.Pig;

public class Matilda extends Bird implements Ally {
    public Matilda(String name) {
        super(name, "white", "Lemparkan Semua Telur!!!");
    }

    @Override
    public void attack(Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s dengan Special Ability: %s!\n", super.getName(), target.getName(), super.getAbility());
    }
}
