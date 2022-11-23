public class Game_Chair {

    public static void start(Player player) {
        player.play();
    }

    public static void findWinner(Player p1, Player p2) {
        System.out.println("Computer picked " + p1.getPicked_num());
        System.out.println("Player 2 picked " + p2.getPicked_num());
        if (p1.getPicked_num() > p2.getPicked_num()) {
            System.out.println("Result: Computer won!");
        } else if (p1.getPicked_num() < p2.getPicked_num()) {
            System.out.println("Result: Player 2 won!");
        } else {
            System.out.println("Result: It's a tie");
        }
    }
}
