public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold("10");
        System.out.println(goldBar);

        Weapon sword = new Weapon("Laser Sword","A Sword with Laser", 15, 35);
        sword.setDamage(30);
        int dvalue = sword.getDamage();
        System.out.println(sword);

        Pillow featherpillow = new Pillow();
        System.out.println(featherpillow);

        Mace spikedball = new Mace();
        System.out.println(spikedball);

        Weapon arrow = new Weapon("Arrow","Shots from long range", 30, 50);
        arrow.setDamage(45);
        int speed = arrow.getDamage();
        System.out.println(arrow);

        Ogre greenOgre = new Ogre("Green","Poison Spit");
        System.out.println(greenOgre);

        Ogre redOgre = new Ogre("Red","Lava Spit");
        System.out.println(redOgre);

        Zombie slowZombie = new Zombie (10);
        System.out.println(slowZombie);

        Zombie fastZombie = new Zombie(15);
        System.out.println(fastZombie);

        Dog spotDog = new Dog ("Can smell blood",20);
        System.out.println(spotDog);

        GiantSpider GiantSpider = new GiantSpider("Spider with two heads");
        System.out.println(GiantSpider);

        BlackBeard BlackBeard = new BlackBeard("He can lay traps",20);
        System.out.println(BlackBeard);
    }

    }
