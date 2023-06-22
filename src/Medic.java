public class Medic extends Hero{

    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }


    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + getSuperAbilityType());
    }

    public void increaseExperience() {
        healPoints += (int) (healPoints * 0.1);
    }

}
