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
        System.out.println("Fighter swings sword");
    }

    public void defend() {
        System.out.println("Fighter raises shield");

    }

    public void useSkill() {
        System.out.println("Fighter throws pickaxe");
    }

    public void specialSkil() {
        System.out.println("Fighter uses tornado sword swings");
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

class Roamer extends Hero {
    public Roamer(String name, int level, int healthPoints) {
        super(name, level, healthPoints);
    }

    public void attack() {
        System.out.println("Roamer roll punch");
    }

    public void defend() {
        System.out.println("Roamer blocks");
    }

    public void useSkill() {
        System.out.println("Roamer spinning punch");
    }

    public void specialSkil() {
        System.out.println("Roamer metal punch");
    }
}

class Jungler extends Hero {
    public Jungler(String name, int level, int healthPoints) {
        super(name, level, healthPoints);
    }

    public void attack() {
        System.out.println("Jungler slash attack");
    }

    public void defend() {
        System.out.println("Jungler shadow evade");
    }

    public void useSkill() {
        System.out.println("Jungler uses assassin slash");
    }

    public void specialSkil() {
        System.out.println("Jungler death slash");
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
        Mage mage = new Mage("Mae", 20, 100);
        System.out.println("Mage Name: " + mage.getName());
        System.out.println("Mage Level: " + mage.getLevel());
        System.out.println("Mage Health Points: " + mage.getHealthPoints());

        Marksman marksman = new Marksman("Layla", 20, 100);
        System.out.println("Marksman Name: " + marksman.getName());
        System.out.println("Marksman Level: " + marksman.getLevel());
        System.out.println("Marksman Health Points: " + marksman.getHealthPoints());

        Jungler jungler = new Jungler("Scoofie", 80, 100);
        System.out.println("Jungler Name: " + jungler.getName());
        System.out.println("Jungler Level: " + jungler.getLevel());
        System.out.println("Jungler Health Points: " + jungler.getHealthPoints());

    }
}
