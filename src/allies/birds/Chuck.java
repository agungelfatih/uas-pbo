package allies.birds;

import allies.Ally;
import enemies.Pig;

public class Chuck extends Bird implements Ally {
    public Chuck(String name) {
        super(name, "yellow", "Kekuatan Terbang Laju!!! Hancurkan semua kayu!!");
    }

    @Override
    public void attack(Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s dengan Special Ability: %s!\n", super.getName(), target.getName(), super.getAbility());
    }
}
