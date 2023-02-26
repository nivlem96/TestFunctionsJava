import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        int sum = 0;
        sum += f1(x);
        sum += f2(x);
        sum += f3(x);

        return sum;
    }

    public static double f1(double x) {
        if (x <= 0) {
            return (x * x) + 1;
        }
        return 0;
    }

    public static double f2(double x) {
        if (0 < x && x < 1) {
            return 1 / (x * x);
        }
        return 0;
    }

    public static double f3(double x) {
        if (x >= 1) {
            return (x * x) - 1;
        }
        return 0;
    }
}