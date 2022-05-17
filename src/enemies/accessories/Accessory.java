package enemies.accessories;

public abstract class Accessory {
    private int hp;

    public Accessory(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
