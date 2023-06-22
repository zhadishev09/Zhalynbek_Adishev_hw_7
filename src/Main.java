public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(250, 70, "Отравление");
        heroes[1] = new Medic(200, 0, "Лечение", 10);
        heroes[2] = new Warrior(300, 80, "Критический урон");


        for (Hero hero : heroes) {
            hero.applySuperAbility();


        }

        System.out.println();




    }
}