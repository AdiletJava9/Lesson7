public abstract class Hero implements HavingSuperAbility {
    private int damage;
    private int health;
    private String superAbilityType;

    public Hero(int damage, int health, String superAbilityType) {
        this.damage = damage;
        this.health = health;
        this.superAbilityType = superAbilityType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }
}
