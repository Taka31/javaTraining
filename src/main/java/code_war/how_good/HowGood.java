package code_war.how_good;

import java.util.Arrays;

public class HowGood {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        System.out.println(Arrays.stream(classPoints).sum()+yourPoints);
        System.out.println(classPoints.length+1);
        System.out.println((Arrays.stream(classPoints).sum()+yourPoints)/(classPoints.length+1));
        return yourPoints>((Arrays.stream(classPoints).sum()+yourPoints)/(classPoints.length+1));
    }

    public static void main(String[] args) {

        int[] myTab={10,10};
        //System.out.println(31/3);

        System.out.println(betterThanAverage(myTab,11));
    }

}
