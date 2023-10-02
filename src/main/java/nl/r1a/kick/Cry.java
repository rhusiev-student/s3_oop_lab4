package nl.r1a.kick;

import nl.r1a.Character;

public class Cry implements KickStrategy {
    @Override
    public void kick(Character whoKicks, Character opponent) {
        System.out.println(whoKicks.toString() + " cries ;(");
    }
}
