import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllPasswords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("password:?\\s*(\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean thereIsPass = false;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            thereIsPass = true;
        }
        if (!thereIsPass) {
            System.out.println("No passwords found.");
        }
    }
}