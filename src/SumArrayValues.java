import java.util.Scanner;

public class SumArrayValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] list = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            list[i] = scanner.nextInt();
        }
        int sumBiggerThan = scanner.nextInt();
        for (int item : list) {
            if (item > sumBiggerThan) {
                sum += item;
            }
        }
        System.out.println(sum);
    }
}
