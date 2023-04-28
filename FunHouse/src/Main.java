public class Main {
    public static void main(String[] args) {
        Player player = new Player("Greenrecon"); // create a new player object with name "John"
        player.move(1, 0); // move the player one tile to the east
        player.print_inventory(); // print the player's inventory
        player.updateGold(); // update the player's gold count
        player.writeToFile(); // write the player's name and gold count to a file
        Banshees banshee = new Banshees();
        //System.out.println("Enemy type: " + banshee.getname());
        /*System.out.println("Description: " + banshee.getdesc());
        System.out.println("Health points: " + banshee.getHealthPoints());
        System.out.println("Attack damage: " + banshee.getAttackDamage());

         */
    }

}