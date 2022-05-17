import allies.birds.Bird;
import enemies.Pig;
import enemies.structures.Structure;

import java.util.ArrayList;

public class AngryBirdsGame {
    ArrayList<Bird> birds;
    ArrayList<Pig> pigs;
    ArrayList<Structure> structures;
    int level;

    public AngryBirdsGame(ArrayList<Bird> birds, ArrayList<Pig> pigs, ArrayList<Structure> structures, int level) {
        this.birds = birds;
        this.pigs = pigs;
        this.structures = structures;
        this.level = level;
    }

    public void start() {
        System.out.println("-----------GAME START-----------\nLevel: " + level);
        System.out.println("######### LIST BIRDS #########");
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i).getName());
        }

        System.out.println("######### LIST PIGS #########");
        for (int i = 0; i < pigs.size(); i++) {
            System.out.println(pigs.get(i).getName());
        }

        System.out.println("######### Terdapat " + structures.size() + " struktur #########");
    }

    public void end(String detail) {
        System.out.println("-----------GAME START-----------\nAnda  " + level + "!!!!!!");
    }
}
