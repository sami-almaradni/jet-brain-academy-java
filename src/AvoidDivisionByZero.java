import java.util.Scanner;

public class AvoidDivisionByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        if (d == 0 || b + c == 0) {
//            System.out.println("Division by zero!");
//        } else {
//            int result = a / ((b + c) / d);
//            System.out.println(result);
//        }

        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        if (string != null) {
            System.out.println(string.toLowerCase());
        } else {
            System.out.println("NPE");
        }
    }
}
