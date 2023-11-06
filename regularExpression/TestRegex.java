public class TestRegex {
    public static void main(String[] args) {
        String str1 = "%s %s".formatted("Hello", "World");
        String str2 = String.format("%s %s", "Hello", "World");
        System.out.println(".formatted(): " + str1);
        System.out.println("String.format(): " + str2);

        String str3 = myFormat("%s %s", "Hello", "World");
        System.out.println("myFormat: " + str3);
    }

    public static String myFormat(String regex, String... args) {
        int index = 0;
        while (regex.matches(".*%s.*")) {
            regex = regex.replaceFirst("%s", args[index++]);
        }
        return regex;
    }
}