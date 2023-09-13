import java.util.Arrays;

public class IndexMult {
    public static void main(String[] args){
        System.out.println(Arrays.toString(indexMult(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(indexMult((new int[]{3, 3, -2, 408, 3, 31}))));
    }
    public static int[] indexMult(int[] array){
        int[] ansArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            ansArray[i] = array[i] * i;
        }
        return ansArray;
    }
}
