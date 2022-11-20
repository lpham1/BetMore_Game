import java.util.Scanner;

public class Player_2 extends Player {
    private boolean user_selected = false;

    public boolean user_selected() {
        return user_selected;
    }

    public void setUser_selected(boolean user_selected) {
        this.user_selected = user_selected;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        int x = 0;
        int count = 0;     
        Scanner s = new Scanner(System.in);   
        while (!user_selected && count < 6) {
            count += 1;
            x = Shuffle.generateNumber();
            if(count==5){
                System.out.println("You have run out of choices");
                System.out.println("Card drawn is: " + x
            + ". This will be your final card.");
            break;
            }
            s = new Scanner(System.in);
            System.out.println("Card drawn is: " + x
            + ". Do you want to pick another card? Type Y or N?");
            String answer = s.nextLine();
            if (answer.equals("N")) {
                user_selected = true;
                // System.out.println(user_selected);
                break;
            }
        }
        this.setPicked_num(x);
        System.out.println("Player 2 chose "+ x);
        s.close();

    }

}
