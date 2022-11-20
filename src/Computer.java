public class Computer extends Player {

    public Computer() {
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        int x = Shuffle.generateNumber();
        this.setPicked_num(x);
        System.out.println("Computer picked a card. Now it's your turn.");
    }
    
    
}
