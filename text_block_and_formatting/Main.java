public class Main {
    public static void main(String[] args) {
        String codeBlock = """
                Print a Bulleted list:
                    \u2022 First item
                    \u2022 Second item
                    \u2022 Third item
                """;

        System.out.println(codeBlock);

        String formattedString = String.format("Hello my name is %s, I'm %d years old", "Loi", 20);

        System.out.println(formattedString);

        String[] arr = { "1", "2", "3" };
        System.out.println(String.join("-", arr));
        System.out.println("*".repeat(15));
    }
}