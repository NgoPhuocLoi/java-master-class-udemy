import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupingAndCapturing {
    public static void main(String[] args) {
        String htmlSnippet = """
                <H1>My Header</H1>
                <h2>Sub-header</h2>
                <p>This is paragraph about something.</p>
                <p>This is another paragraph about something else.</p>
                <h3>Summary</h3>
                """;

        Pattern headerPattern = Pattern.compile("<[hH](?<level>\\d)>(.*)</[hH]\\d>");
        Matcher matcher = headerPattern.matcher(htmlSnippet);

        while (matcher.find()) {
            System.out.println("group(): " + matcher.group());
            System.out.println("group('level'): " + matcher.group("level"));
            System.out.println("group(2): " + matcher.group(2));
            System.out.println("index of level: " + matcher.start("level"));
            System.out.println();
        }

        System.out.println("-".repeat(20));
        matcher.reset();
        matcher.results().forEach(r -> System.out.println(r.group(1) + ": " + r.group(2)));

        System.out.println("-".repeat(20));
        String replacedHtml = matcher.replaceFirst(mr -> "<em>" + mr.group(2) + "</em>");
        System.out.println("replacedHtml: \n" + replacedHtml);

        System.out.println("-".repeat(20));
        String replacedHtmlWithBackRef = matcher.replaceFirst("<em>$2</em>");
        System.out.println("replacedHtml: \n" + replacedHtmlWithBackRef);
    }
}
