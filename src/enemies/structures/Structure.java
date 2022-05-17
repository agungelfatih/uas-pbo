package enemies.structures;

public abstract class Structure {
    private int hp;
    private int size;
    private String color;

    public Structure(int hp, int size, String color) {
        this.hp = hp;
        this.size = size;
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
