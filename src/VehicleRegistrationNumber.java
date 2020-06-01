import java.util.Scanner;

public class VehicleRegistrationNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        String pattern = "[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}";

        boolean isValid = regNum.matches(pattern);
        System.out.println(isValid);
    }
}
