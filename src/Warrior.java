public class Warrior extends Hero {
    public Warrior(int damage, int health, String superAbilityType) {
        super(damage, health, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность CRITICAL DAMAGE");
    }
}
