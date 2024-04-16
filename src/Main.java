abstract class Hero {
    private String name;
    private int level;
    private int healthPoints;

    public Hero(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void specialSkil();

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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

}

class Fighter extends Hero {
    public Fighter(String name, int level, int healthPoints) {
        super(name, level, healthPoints);
    }

    public void attack() {
        System.out.println("Swings sword");
    }

    public void defend() {
        System.out.println("Raises shield");

    }

    public void useSkill() {
        System.out.println("Throws pickaxe");
    }

    public void specialSkil() {
        System.out.println("Tornado Sword Swings");
    }
}

class Mage extends Hero {
    public Mage(String name, int level, int healthPoints) {
        super(name, level, healthPoints);
    }

    public void attack() {
        System.out.println("Mage shoot fire burst");
    }

    public void defend() {
        System.out.println("Mage summon glass shield");
    }

    public void useSkill() {
        System.out.println("Mage flame tsunami");
    }

    public void specialSkil() {
        System.out.println("Mage unleash raining Sun Storm");
    }
}

class Marksman extends Hero {
    public Marksman(String name, int level, int healthPoints) {
        super(name, level, healthPoints);
    }

    public void attack() {
        System.out.println("Marksman shoots bullet");
    }

    public void defend() {
        System.out.println("Marksman rolls");
    }

    public void useSkill() {
        System.out.println("Marksman uses laser");
    }

    public void specialSkil() {
        System.out.println("Marksman uses laser beam");
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

        Item sword = new Item("Excalibur");
        System.out.println("Equipped Item: " + sword.getName());
    }
}
