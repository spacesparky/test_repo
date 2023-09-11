
public class DiffEvo {
    public static void main(String[] args){
        System.out.println(differenceEvenOdd({44, 32, 86, 19}));
        System.out.println(differenceEvenOdd(({22, 50, 16, 63, 31, 55}));
    }
    public static int differenceEvenOdd(int[] array){
        int ans = 0;
        for (int i=1; i<array.length;i++) {
            if (array[i] % 2 == 0){
                ans = ans + array[i];
            }
            else {ans = ans - array[i];}
        }
        return ans;
    }
}