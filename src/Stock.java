public class Stock {
    public static float containers(int box, int bags, int barrels) {
        return box * 20 + bags * 50 + barrels * 100;
    }
    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
    }
}
