import java.util.Scanner;

public class NumberParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "write-your-regex-here";

        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}

/**
 ^[1-9]+|-[1-9]+|(\+)?(-)?[(-0)?1-9]+(,)?(\.)?[0-9]
 */