package nl.r1a;

import java.util.ArrayList;
import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        // Get a random subclass of Character and instantiate it
        ArrayList<Class<? extends Character>> characterClasses = new ArrayList<>();
        characterClasses.add(Elf.class);
        characterClasses.add(Hobbit.class);
        characterClasses.add(King.class);
        characterClasses.add(Knight.class);
        
        Random random = new Random();
        int randomIndex = random.nextInt(characterClasses.size());

        try {
            return characterClasses.get(randomIndex).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
