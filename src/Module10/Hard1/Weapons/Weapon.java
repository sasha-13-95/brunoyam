package Module10.Hard1.Weapons;

public abstract class Weapon implements WeaponInterface {
    private int damage;
    private String name;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int causeDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
