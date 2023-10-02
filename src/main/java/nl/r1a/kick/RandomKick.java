package nl.r1a.kick;

import nl.r1a.Character;

public class RandomKick implements KickStrategy {
    private int min = 5;
    private int max = 15;

    public RandomKick(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * (max - min) + min);
    }

    @Override
    public void kick(Character whoKicks, Character opponent) {
        opponent.setHp(opponent.getHp() - whoKicks.getPower());
    }
}
