package training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegex {

    public static void main(String[] args) {
        String monTexte = "salut je m'appelle JC";
        String pattern = "Cyril";
        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher(monTexte);

        if(matcher.find()){
            System.out.println("j'ai trouve au moins une occurence");
        }else{
            System.out.println("O occurences trouve");
        }

    }
}
