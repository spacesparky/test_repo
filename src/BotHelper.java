public class BotHelper {
    public static void main(String[] args) {
        System.out.println(botHelper("Hello, I’m under the water, please help me"));
        System.out.println(botHelper("Two pepperoni pizzas please"));
    }

    public static String botHelper(String input) {
        String lowercaseInput = input.toLowerCase();
        if (lowercaseInput.contains("help")) {
            return "Calling for a staff member";
        } else {
            return "Keep waiting";
        }
    }

}
