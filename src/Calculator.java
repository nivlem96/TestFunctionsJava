import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        String operator = scanner.next();
        long number2 = scanner.nextLong();
        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(number1 / number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
