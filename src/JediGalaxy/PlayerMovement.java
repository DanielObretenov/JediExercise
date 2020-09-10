package JediGalaxy;

public abstract class PlayerMovement implements Movement{
    protected int row;
    protected int column;

    public PlayerMovement(int row, int col){
        this.row = row;
        this.column = col;
    }


}
