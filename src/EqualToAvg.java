public class EqualToAvg {
    public static void main(String[] args){
        System.out.println(equalToAvg(new int[]{1, 2, 3, 4, 5}));
        System.out.println(equalToAvg((new int[]{1, 2, 3, 4, 6})));
    }
    public static boolean equalToAvg(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        float avg = (float) sum / array.length;
        for (int i : array){
            if (avg == i){
                return true;
            }
        }
        return false;
    }
}
