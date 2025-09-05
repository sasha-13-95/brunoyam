package Module10.Hard1.Heroes;

public interface HeroInterface {
    void playerAttack(Hero opponent);

    String getName();

    int getHealthScale();

    void setHealthScale(int healthScale);

    int getWeapon();
}
