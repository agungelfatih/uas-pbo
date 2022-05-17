package enemies;

import enemies.accessories.Accessory;

import java.util.ArrayList;

public class Pig implements Enemy {
    private String name;
    private int hp;
    private String color;
    private int size;
    private ArrayList<Accessory> accessories;

    public Pig(String name, ArrayList<Accessory> accessories) {
        this.name = name;
        this.color = "green";
        this.size = 1;
        this.accessories = accessories;
        initializeHp();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<Accessory> accessories) {
        this.accessories = accessories;
    }

    @Override
    public void gotAttacked(int damage) {
        if (hp < 1) {
            System.out.printf("[Pig] %s terbunuh!!!",name);
        } else {
            hp -= damage;
        }
    }

    public void initializeHp() {
        int temp = 0;
        if (!accessories.isEmpty()){
            for (int i = 0; i < accessories.size(); i++) {
                temp += accessories.get(i).getHp();
            }
        } else temp++;

        hp = temp;
    }
}
