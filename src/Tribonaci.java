
public class Tribonaci {
    public static void main(String[] args){
        System.out.println(equalToAvg(7));
        System.out.println(equalToAvg((11)));
    }
    public static int equalToAvg(int num) {
        int a = 0;
        int b = 0;
        int c = 1;
        int sum = 0;
        for (int i = 0; i < num - 3; i++) {
            sum = c + b + a;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}
