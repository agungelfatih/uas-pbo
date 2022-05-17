import allies.Slingshot;
import allies.birds.*;
import enemies.Pig;
import enemies.accessories.Accessory;
import enemies.accessories.ChainMail;
import enemies.accessories.Hat;
import enemies.structures.Glass;
import enemies.structures.Stone;
import enemies.structures.Structure;
import enemies.structures.Wood;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Membuat 5 objek bird
        ArrayList<Bird> birds = new ArrayList<>();
        Bird bird1 = new Red("Red");
        Bird bird2 = new TheBlues("The Blues");
        Bird bird3 = new Chuck("Chuck");
        Bird bird4 = new Bomb("Bomb");
        Bird bird5 = new Matilda("Matilda");
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(bird4);
        birds.add(bird5);

        Slingshot slingshot = new Slingshot();
        ArrayList<Accessory> accessories1 = new ArrayList<>();
        accessories1.add(new ChainMail());
        accessories1.add(new Hat());

        ArrayList<Accessory> accessories2 = new ArrayList<>();
        accessories2.add(new ChainMail());

        ArrayList<Accessory> accessories3 = new ArrayList<>();
        accessories3.add(new Hat());

        //Membuat 4 objek Pig
        ArrayList<Pig> pigs = new ArrayList<>();
        Pig pig1 = new Pig("Wan", accessories1);
        Pig pig2 = new Pig("Duo", accessories1);
        Pig pig3 = new Pig("Tri", accessories2);
        Pig pig4 = new Pig("Four", accessories3);
        pigs.add(pig1);
        pigs.add(pig2);
        pigs.add(pig3);
        pigs.add(pig4);

        //Membuat structures
        ArrayList<Structure> structures = new ArrayList<>();
        int c = 15;
        for (int i = 0; i < c; i++) {
            int temp = c / 3;
            if (i < temp) {
                structures.add(new Glass());
            } else if (i < temp * 2) {
                structures.add(new Wood());
            } else {
                structures.add(new Stone());
            }
        }


        AngryBirdsGame game = new AngryBirdsGame(birds,pigs,structures,16);
        game.start();


    }

    static void generateStructure() {

    }


}
