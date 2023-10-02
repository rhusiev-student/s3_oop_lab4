package nl.r1a.kick;

import nl.r1a.Character;

public interface KickStrategy {
    void kick(Character whoKicks, Character opponent);
}
