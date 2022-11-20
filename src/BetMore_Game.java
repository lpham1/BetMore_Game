
public class BetMore_Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, you are Player 2");
        Player comp = new Computer();
        Player player2 = new Player_2();
        Game_Chair.start(comp);
        Game_Chair.start(player2);
        Game_Chair.findWinner(comp, player2);
    
    }
}
