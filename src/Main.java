abstract class Hero {
    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void useSkill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class Warrior extends Hero {
    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void useSkill() {
        System.out.println("Warrior uses Slash!");
    }
}

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 10);
        System.out.println("Hero: " + warrior.getName());
        System.out.println("Level: " + warrior.getLevel());
        warrior.useSkill();

        Item sword = new Item("Excalibur");
        System.out.println("Equipped Item: " + sword.getName());
    }
}
