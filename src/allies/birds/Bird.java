package allies.birds;

public abstract class Bird {
    private String name;
    private String color;
    private String ability;

    public Bird(String name, String color, String ability) {
        this.name = name;
        this.color = color;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
