public class tables {
    public static int tables(int students, int desks) {
        int tablesNeeded = (students + 1) / 2 - desks;

        if (tablesNeeded < 0) {
            tablesNeeded = 0;
        }

        return tablesNeeded;
    }
    public static void main(String[] args) {
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
}
