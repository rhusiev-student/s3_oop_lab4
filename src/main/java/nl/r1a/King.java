package nl.r1a;

import nl.r1a.kick.RandomKick;

public class King extends Character {
    static RandomKick kick = new RandomKick(5, 15);

    public King() {
        super(kick.generateRandomNumber(), kick.generateRandomNumber(), kick);
    }
}
