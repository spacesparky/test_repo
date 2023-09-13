public class Streverse {
    public static void main(String[] args){
        System.out.println(reverse("Ryan Gosling"));
        System.out.println(reverse("Barack Obama"));
    }
    public static String reverse(String str){
        String ans = "";
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            ans= ch+ans;
        }
        return ans;
    }
}
