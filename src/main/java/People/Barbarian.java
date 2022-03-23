package People;

import Characters.Enemy;
import Interfaces.IWeapon;
import Moves.Sword;

public class Barbarian extends Fighter{

    IWeapon weapon;

    public Barbarian(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(weapon.attack());
    }
}
