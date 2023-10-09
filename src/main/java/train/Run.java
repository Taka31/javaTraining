package train;

import code_war.sequence.Sequence;

public class Run {

    public static void main(String[] args) {

        int[] values = Sequence.reverse(12);

        for(int value : values){
            System.out.println(value);
        }

    }
}
