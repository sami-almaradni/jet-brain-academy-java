import java.util.*;
import java.util.regex.*;

public class InTheMiddleOfAWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        String answer = "";

        String[] splittingLine = line.split(" ");
        for (int i = 0; i < splittingLine.length; i++) {
            Pattern pattern = Pattern.compile("\\S.*" + part + ".*\\S", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(splittingLine[i]);

            answer = matcher.matches() ? "YES" : "NO";

            if (answer == "YES") {
                break;
            }
        }
        System.out.println(answer);
    }
}
