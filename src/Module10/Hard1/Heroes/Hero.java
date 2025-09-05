package Module10.Hard1.Heroes;


import Module10.Hard1.Weapons.Weapon;

import java.util.Random;

public abstract class Hero implements HeroInterface {
    private Random random = new Random();
    private Weapon weapon;
    private String name;
    private int healthScale;

    public Hero(String name, int healthScale, Weapon weapon) {
        this.name = name;
        this.healthScale = healthScale;
        this.weapon = weapon;
        System.out.println("У " + name + " имеется " + healthScale + " баллов здоровья и оружие " + weapon.getName() + ", которое наносит " + weapon.causeDamage() + " урона.");
    }

    public void playerAttack(Hero opponent) {
        int hittingTheTarget = random.nextInt(0, 2);
        if (hittingTheTarget == 0) {
            System.out.println(name + " не попал в " + opponent.getName());
        } else {
            int healthScale = opponent.getHealthScale() - weapon.causeDamage();
            opponent.setHealthScale(healthScale);
            System.out.println(name + " нанес урон " + opponent.getName() + ". У " + opponent.getName() + " осталось " + opponent.getHealthScale() + " баллов здоровья.");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealthScale() {
        return healthScale;
    }

    public void setHealthScale(int healthScale) {
        this.healthScale = healthScale;
    }

    public int getWeapon() {
        int damage = weapon.causeDamage();
        return damage;
    }
}
