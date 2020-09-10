package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] galaxyDimensions = readCoordinates(sc.nextLine());
        int[] jediPosition = readCoordinates(sc.nextLine());
        int[] sithPosition = readCoordinates(sc.nextLine());
        Galaxy galaxy = new Galaxy(galaxyDimensions[0],galaxyDimensions[1]);
        JediMovement jediMovement = new JediMovement(jediPosition[0],jediPosition[1]);
        SithMovement sithMovement = new SithMovement(sithPosition[0],sithPosition[1]);
        galaxy.setJediMovement(jediMovement);
        galaxy.setSithMovement(sithMovement);
        galaxy.moveSithThroughGalaxy();
        galaxy.moveJediThroughGalaxy();
        System.out.println(galaxy.getJediSum());

    }
    private static int[] readCoordinates(String line){
        return  Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
