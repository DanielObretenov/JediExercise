package JediGalaxy;

public class Galaxy {
    private final int rows;
    private final int columns;
    private JediMovement jediMovement;
    private SithMovement sithMovement;
    private int jediSum;



    private int[][] galaxy;

    public Galaxy(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        CreateGalaxy(this.rows,this.columns);
    }

    private void CreateGalaxy(int rows, int columns) {
        galaxy = new int[rows][columns];
        int counter  = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                this.galaxy[row][column] = counter++;
            }
        }
    }
    public int[][] getGalaxy() {
        return galaxy;
    }
    public void setJediMovement(JediMovement jediMovement) {
        this.jediMovement = jediMovement;
    }

    public void setSithMovement(SithMovement sithMovement) {
        this.sithMovement = sithMovement;
    }
    public void moveJediThroughGalaxy(){
        this.jediMovement.move(this.getGalaxy());
        this.jediSum = jediMovement.getSum();
    }
    public void moveSithThroughGalaxy(){
        this.sithMovement.move(this.getGalaxy());
    }

    public int getJediSum() {
        return jediSum;
    }
}
