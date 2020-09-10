package JediGalaxy;

public class JediMovement extends PlayerMovement implements Movement{
    private int sum;

    public JediMovement(int row, int column) {
        super(row,column);
        this.sum = 0;
    }

    @Override
    public void move(int[][] galaxy) {
        while (this.row >= 0 && this.column < galaxy[0].length){
            if (inBounds(galaxy)){
                this.sum+= galaxy[this.row][this.column];
            }
            this.row--;
            this.column++;
        }
    }

    private boolean inBounds(int[][] galaxy) {
        return this.row >= 0 && this.row < galaxy.length && this.column >= 0 && this.column < galaxy[0].length;
    }

    public int getSum() {
        return sum;
    }
}
