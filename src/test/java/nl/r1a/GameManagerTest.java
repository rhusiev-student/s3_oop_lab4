package nl.r1a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameManagerTest {
    private GameManager gameManager;

    @BeforeEach
    public void setup() {
        gameManager = new GameManager();
    }

    @Test
    public void testCreateCharacter() {
        Character randomCharacter = CharacterFactory.createCharacter();
        assertEquals(true, randomCharacter instanceof Character);
    }

    @Test
    public void testFightElfHobbit() {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        gameManager.fight(elf, hobbit);
        assertEquals(elf.getHp(), 10);
        assertEquals(hobbit.getHp(), 0);
    }
}
