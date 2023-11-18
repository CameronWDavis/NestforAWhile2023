import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContestProblemCtry2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b\\w+\\b|\\W+");
        Matcher matcher = pattern.matcher(in);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String part = matcher.group();

            if (part.matches("\\w+")) {

                if (isVowel(part.charAt(0))) {
                    result.append(part).append("moo");
                } else {
                    if (part.length() > 1) {
                        result.append(part.substring(1)).append(part.charAt(0)).append("moo");
                    } else {
                        result.append(part).append("moo");
                    }
                }
            } else {

                result.append(part);
            }
        }

        System.out.println(result);
        scanner.close();
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}
