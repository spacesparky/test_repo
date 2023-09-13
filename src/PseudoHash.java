
import java.util.Random;

public class PseudoHash {
    public static void main(String[] args){
        System.out.println(pseudoHash(7));
        System.out.println(pseudoHash((11)));
    }
    public static String pseudoHash(int num) {
        Random random = new Random();
        StringBuilder hash = new StringBuilder();
        for (int i = 0; i < num; i++) {
        boolean b = random.nextBoolean();
            if (b){
                hash.append(random.nextInt(9));
            }
            else {
                hash.append((char)(random.nextInt(6) + 'a'));
            }
        }
        return hash.toString();
    }

}
