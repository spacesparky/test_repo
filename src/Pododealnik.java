public class Pododealnik {
    public static float count(int n, float w, float h) {
        return (int) (n /(w*h));
    }
    public static void main(String[] args) {
        System.out.println(count(22, 1.4f, 2));
        System.out.println(count(45, 1.8f, 1.9f));
        System.out.println(count(100, 2, 2));
    }
}
