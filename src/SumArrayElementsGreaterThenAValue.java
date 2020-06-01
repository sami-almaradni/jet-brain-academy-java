import java.util.Scanner;

public class SumArrayElementsGreaterThenAValue {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Array length: ");
        int arrLength = input.nextInt();

        System.out.print("Array indexes: ");
        int[] numArray = new int[arrLength];
        for (int i = 0; i < numArray.length; i++) {
            int index = input.nextInt();
            numArray[i] = index;
        }

        System.out.print("Array factor: ");
        int factor = input.nextInt();
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > factor) {
                sum += numArray[i];
            }
        }
        System.out.println(sum);

    }
}
