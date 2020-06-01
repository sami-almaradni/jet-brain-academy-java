import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartOrEndOfAWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        String answer = "";

        String[] splittingLine = line.split(" ");
        for (int i = 0; i < splittingLine.length; i++) {
            Pattern pattern = Pattern.compile(part + "\\b|\\b" + part, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(splittingLine[i]);

            answer = matcher.find() ? "YES" : "NO";
            if (answer == "YES") {
                break;
            }
        }
        System.out.println(answer);
    }
}
