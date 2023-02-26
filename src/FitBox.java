import java.util.*;

public class FitBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] smallBox;
        int[] largeBox;
        System.out.println("The original array is: ");
        for (int num : box1) {
            System.out.println(num + " ");
        }
        System.out.println("The original array is: ");
        for (int num : box2) {
            System.out.println(num + " ");
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        System.out.println("The new array is: ");
        for (int num : box1) {
            System.out.println(num + " ");
        }
        System.out.println("The new array is: ");
        for (int num : box2) {
            System.out.println(num + " ");
        }
        String smallOrBigger = "<";
        boolean incompatible = false;
        if(box1[0] < box2[0]) {
            smallBox = box1;
            smallOrBigger = "<";
            largeBox = box2;

        } else {
            smallBox = box2;
            smallOrBigger = ">";
            largeBox = box1;
        }

        for (int i = 0; i < smallBox.length; i++) {
            System.out.println("smallBox " + smallBox[i]);
            System.out.println("largeBox " + largeBox[i]);
            if(smallBox[i] >= largeBox[i]) {
                incompatible = true;
                break;
            }
        }

        if(incompatible) {
            System.out.println("Incompatible");
        } else {
            System.out.println("Box 1 " + smallOrBigger + " Box 2");
        }
    }
}