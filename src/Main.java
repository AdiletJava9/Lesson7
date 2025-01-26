
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "FIREBALL"),
                new Medic(120, 10, "HEALING", 50),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic medic) {
                medic.increaseExperience(); // Увеличение healPoints
                System.out.println("Опыт медика увеличен. Новые healPoints: " + medic.getHealPoints());
            }
        }

    }
}