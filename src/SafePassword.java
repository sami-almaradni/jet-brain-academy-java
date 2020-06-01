import java.util.*;

public class SafePassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String PASSWORD = input.nextLine();

        String pattern = "[A-Z]+[a-z]+[12]+\\d+|" +
                        "[12]\\d+[A-Z]+[a-z]+|" +
                        "[A-Z]+[a-z]+[12]\\d+[A-Z]+[a-z]+|" +
                        "[a-z]+[A-Z]+[12]\\d+|" +
                        "[12]+\\d+[a-z]+[A-Z]+|";

        String answer = PASSWORD.matches(pattern) ? "YES" : "NO";

        System.out.println(answer);
    }
}

/**
 * 1- A a 12 (num || sym)
 * 3- A a (num || sym) 12
 * 5- A (num || sym) a  12
 * 6- (num || sym) A a 12
 * 6- (num || sym) A 12 a
 * 6- (num || sym) 12 A a
 * 6- (num || sym) 12 a A
 * 6- (num || sym) A a 12
 * 6- (num || sym) a A 12
 * 6- (num || sym) a 12 A
 * 6- 12 (num || sym) A a
 * 6- 12 A (num || sym) a
 * 6- 12 A a (num || sym)
 * 6- 12 A a (num || sym)
 * 6- 1233 a A
 * 6- 1233 a A
 * 6- 1233 a A
 */