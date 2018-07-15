public class DarkanGame {
    public static void main(String[] args) {
        Character hero=new Hero();
        Weapon sword=new Sword("Exkalibur", 50);
        hero.setWeapon(sword);

        Character marie=new NPC("Marie");
        Weapon woodSword=new Sword("Wood sword", 5);
        marie.setWeapon(woodSword);

        System.out.println(marie.getWeaponStats());
        System.out.println(hero.getWeaponStats());
        hero.enchantWeapon(10);
        System.out.println(hero.getWeaponStats());

        Weapon ironHammer=new Hammer("Iron Hammer", 40);
        marie.setWeapon(ironHammer);
        System.out.println(marie.getWeaponStats());

        Armour ironArmour=new IronArmour("Defender", 100);
        System.out.println(ironArmour.getName());
        hero.setArmour(ironArmour);
        System.out.println(hero.getArmourStats());

        Character something = new NPC("Alan")
                .setWeaponWithCreate(ironHammer)
                .setArmourWithCreate(ironArmour);

        System.out.println(something.getName());
        System.out.println(something.getWeaponStats());
        System.out.println(something.getArmourStats());

        Character goul = new Goblin("Ms Goul")
                .setWeaponWithCreate(woodSword)
                .setArmourWithCreate(new IronArmour(5));

        System.out.println(goul.getName());
        System.out.println(goul.getWeaponName());
        System.out.println(goul.getArmourName());

        hero.fight(goul);
    }
}