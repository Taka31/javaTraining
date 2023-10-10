package code_war.more_zero;

import java.util.HashSet;
import java.util.Set;
import static java.util.stream.Collectors.joining;

// my Solution
public class MoreZero {
    public static char[] moreZeros(String s) {
        char[] chars = s.toCharArray();
        Set<Character> mySet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            String code = Integer.toBinaryString(c);
            if (code.replaceAll("[1]", "").length() > code.replaceAll("[0]", "").length()) {
                if (mySet.add(c)) {
                    result.append(c);
                }
            }
        }
        return result.toString().toCharArray();
    }


    // best solution
    static char[] moreZeros2(String s) {
        return s.chars().distinct().filter(i -> 1.44 * Math.log(i) > 2 * Integer.bitCount(i))
                .mapToObj(c -> "" + (char) c).collect(joining()).toCharArray();
    }

    public static void main(String[] args) {
        char[] result = moreZeros2("thequickbrownfoxjumpsoverthelazydog");
        for (char c : result) {
            System.out.println("my char saved is " + c);
        }
    }
}
