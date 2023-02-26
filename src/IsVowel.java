import java.util.Scanner;

public class IsVowel {
    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
            case 'A':
            case 'E':
            case 'O':
            case 'U':
            case 'I':
                return true;
            default:
                return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
