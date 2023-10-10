package code_war.persistence;

public class Persist {

    public static int persistence(long n) {
        String numberToString = Long.toString(n);
        if (numberToString.length() <= 1) {
            System.out.println("je suis dans le dernier tour de ma recursive");
            return 0;
        } else {
            System.out.println("je rentre dans le traitement");
            int result = numberToString.chars().map(Character::getNumericValue).reduce(1, (a, b) -> a * b);
            System.out.println("mon chiffre multiplie est " + result);
            return persistence(result) + 1;
        }
    }


    public static void main(String[] args) {
        int result = persistence(48);
        System.out.println("resultat final " + result);
    }
}
