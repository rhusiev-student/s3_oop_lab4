package nl.r1a;

import nl.r1a.kick.KillWeaker;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new KillWeaker());
    }
}
