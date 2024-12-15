public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(120);
        boss.setTypeOfDefence("Magic");
        System.out.println("информация о Боссе :  ");
        System.out.println(" Здоровье Босса: " + boss.getHealth());
        System.out.println(" Урон Босса: " + boss.getDamage());
        System.out.println(" Тип защиты: " + boss.getTypeOfDefence());
        Hero[] heroes = createHeroes();
        for( Hero hero : heroes) {
            System.out.println("Здоровье Героя: " + hero.getHealth() );
            System.out.println("Урон Героя: " + hero.getDamage());
            System.out.println("Супер способности Героя: " + hero.getSuperAbility());
        }


    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero(150, 40, "Telepatic");
        Hero hero1 = new Hero(250,50,"Magical" );
        Hero hero2 = new Hero (280, 65);
        return new Hero[] {
                hero, hero1, hero2
        };

    }
}
