package code_war.ohs;

public class OHS {

    public static boolean getXO (String str) {
       return  str.replaceAll("[Oo]","").length()== str.replaceAll("[Xx]","").length();
    }

    public static void main(String[] args) {
        System.out.println(getXO("XXxooO"));
    }
}
