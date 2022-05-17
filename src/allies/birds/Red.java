package allies.birds;

import allies.Ally;
import enemies.Pig;

public class Red extends Bird implements Ally {
    public Red(String name) {
        super(name, "Red", "-");
    }

    @Override
    public void attack(Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s\n", super.getName(), target.getName());
    }

}
