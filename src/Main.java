public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                    Print a bulleted list:
                        \u2022 First Point
                             \u2022 Second Point""";

        System.out.println(textBlock);

    }
}