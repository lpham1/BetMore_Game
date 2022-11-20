public abstract class Player {
    private int picked_num;
    public int getPicked_num() {
    return picked_num;
}

public void setPicked_num(int picked_num) {
    this.picked_num = picked_num;
}
public abstract void play();
    
}
