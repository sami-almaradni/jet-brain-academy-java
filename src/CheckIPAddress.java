import java.util.*;

public class CheckIPAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final String IP_ADDRESS = input.nextLine();

        String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        String answer = IP_ADDRESS.matches(pattern) ? "YES" : "NO";

        System.out.println(answer);
    }
}
