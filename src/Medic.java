public class Medic extends Hero {
    private int healPoints;


    public void increaseExperience() {
        healPoints += (int) (healPoints * 0.1);
    }

    public Medic(int damage, int health, String superAbilityType, int healPoints) {
        super(damage, health, superAbilityType);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING");
    }

    public int getHealPoints() {
        return healPoints;
    }
}
