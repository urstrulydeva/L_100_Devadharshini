package Design_patterns.Prototype_pattern;

public class Main {
    public static void main(String[] args) {

        GameCharacter warrior = new GameCharacter("Warrior","weapon",100);
       // Clone archer and modify
        GameCharacter archerClone = warrior.clone();
        GameCharacter maceClone = warrior.clone();
        GameCharacter javelinClone = warrior.clone();

        // Customize clones
        archerClone = new GameCharacter("Quick Archer", "Crossbow", 70);
        maceClone = new GameCharacter("Mace Warrior", "Mace", 200);
        javelinClone = new GameCharacter("Javelin Throw", "Javelin", 100);

        System.out.println(archerClone);
        System.out.println(maceClone);
        System.out.println(javelinClone);
    }
}
