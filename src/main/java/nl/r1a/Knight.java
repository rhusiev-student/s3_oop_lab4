package nl.r1a;

import nl.r1a.kick.RandomKick;

public class Knight extends Character {
    static RandomKick kick = new RandomKick(2, 12);

    public Knight() {
        super(kick.generateRandomNumber(), kick.generateRandomNumber(), kick);
    }
}
