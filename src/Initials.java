import static java.lang.Character.isUpperCase;

public class Initials {

    public static void main(String[] args){
        System.out.println(getInitials("Ryan Gosling"));
        System.out.println(getInitials("Barack Obama"));
    }
    public static String getInitials(String str){
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for (int i=1; i<str.length();i++) {
            char currentChar = str.charAt(i);
            if (isUpperCase(currentChar)){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}