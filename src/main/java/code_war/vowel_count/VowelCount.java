package code_war.vowel_count;

public class VowelCount {

    public static int getCount(String str){

        String result = str.replaceAll("[^aeiou]","");
        return result.length();
    }
}
