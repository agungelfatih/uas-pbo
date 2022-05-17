package allies;

import allies.birds.Bird;
import enemies.Pig;

public class Slingshot{

    public static void attack(Bird source, Pig target) {
        System.out.printf("[Bird] %s menyerang target [Pig] %s", source.getName(), target.getName());
    }
}
