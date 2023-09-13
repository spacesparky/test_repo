public class Anagrams {
        public static void main(String[] args) {
            System.out.println(isAnagram("listen", "silent"));
            System.out.println(isAnagram("eleven plus two", "twelve plus one"));
            System.out.println(isAnagram("hello", "world"));
        }

        public static boolean isAnagram(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            for (int i = 0; i<str1.length(); i++){
                if (charArray1[i] != charArray2[charArray2.length - i-1]){
                    return false;
                }
            }
            return true;
        }
}
