package nl.r1a.kick;

import nl.r1a.Character;

public class KillWeaker implements KickStrategy {
    @Override
    public void kick(Character whoKicks, Character opponent) {
        if (opponent.getPower() < whoKicks.getPower()) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}
