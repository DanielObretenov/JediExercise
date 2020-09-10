package JediGalaxy;

public class SithMovement extends PlayerMovement implements Movement{

    public SithMovement(int row, int column) {
        super(row,column);
    }

    @Override
    public void move(int[][] galaxy) {
        while (this.row >= 0 && this.column >= 0){
            if (inBounds(galaxy)){
                 galaxy[this.row][this.column] = 0;
            }
            this.row--;
            this.column--;
        }
    }

    private boolean inBounds(int[][] galaxy) {
        return this.row >= 0 && this.row < galaxy.length && this.column > 0 && this.column < galaxy[0].length;
    }
}
