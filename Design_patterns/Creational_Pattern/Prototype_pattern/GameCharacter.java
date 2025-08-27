package Design_patterns.Creational_Pattern.Prototype_pattern;

class GameCharacter implements Prototype {
    private String name;
    private String weapon;
    private int health;

    public GameCharacter(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public GameCharacter clone() {
        return new GameCharacter(name, weapon, health); // clone properties
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", weapon=" + weapon + ", health=" + health + "]";
    }
}

