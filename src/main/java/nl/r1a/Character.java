package nl.r1a;

import lombok.Getter;
import nl.r1a.kick.KickStrategy;

@Getter
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }

    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }

    public boolean isAlive() { return hp > 0; }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setPower(int power) { this.power = power; }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp +
            ", power=" + power + "}";
    }
}
