package nl.r1a;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("THE FIIIIGHT BETWEEN " + c1.toString() +
                           " and " + c2.toString());
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.toString() + " kicks " + c2.toString() + "!");
            c1.kick(c2);
            System.out.println("They are now: " + c1.toString() + " and " +
                               c2.toString());
            if (c2.isAlive()) {
                System.out.println(c2.toString() + " kicks " + c1.toString() +
                                   "!");
                c2.kick(c1);
                System.out.println("They are now: " + c1.toString() + " and " +
                                   c2.toString());
            } else {
                System.out.println(c2.toString() + " is dead!");
            }
            if (!c1.isAlive()) {
                System.out.println(c1.toString() + " is dead!");
            }
        }
    }

    public static void main(String[] args) {
        GameManager gameMaster = new GameManager();
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        gameMaster.fight(c1, c2);
    }
}
