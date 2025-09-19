public class StringUtils {


    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }


    public static String removeSpaces(String input) {
        return input.replace(" ", "");
    }


    public static String toAlternatingCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }


    public static String repeat(String input, int times) {
        return input.repeat(times);
    }


    public static String maskify(String input) {
        int length = input.length();
        if (length <= 4) return input;
        String masked = "#".repeat(length - 4);
        return masked + input.substring(length - 4);
    }



}
