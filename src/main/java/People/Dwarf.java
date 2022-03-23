package People;

import Characters.Enemy;
import Interfaces.IWeapon;
import Moves.Axe;

public class Dwarf extends Fighter{

    IWeapon weapon;

    public Dwarf(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(weapon.attack());
    }
}
