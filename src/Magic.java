public class Magic extends Hero {

    public Magic(int damage, int health, String superAbilityType) {
        super(damage, health, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность FIREBALL");
    }
}
