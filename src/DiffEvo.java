
public class DiffEvo {
    public static void main(String[] args){
        System.out.println(differenceEvenOdd(new int[]{44, 32, 86, 19}));
        System.out.println(differenceEvenOdd((new int[]{22, 50, 16, 63, 31, 55})));
    }
    public static int differenceEvenOdd(int[] array){
        int ans = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                ans = ans + j;
            } else {
                ans = ans - j;
            }
        }
        return ans;
    }
}