package code_war.sequence;

import java.util.stream.IntStream;

public class Sequence {

    public static int[] reverse(int n){
        return IntStream.range(-n,0).map(Math::abs).toArray();
    }
}
