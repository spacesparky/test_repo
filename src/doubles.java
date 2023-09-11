public class doubles {
    public static void main(String[] args) {
        System.out.println(duplicate("Donald")); // ➞ true
        System.out.println(duplicate("orange")); // ➞ false
    }

    public static boolean duplicate(String str) {
        str = str.toLowerCase();
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charSet[currentChar]) {
                return true;
            }
            charSet[currentChar] = true;
        }
        return false;
    }
}
