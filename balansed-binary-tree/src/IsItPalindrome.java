import java.util.Arrays;

public class IsItPalindrome {
    static void main() {
        System.out.println(isPalindrome("P"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder filteredPal = new StringBuilder();
        for(char c : s.toLowerCase().trim().toCharArray()) {
            if(Character.isDigit(c)|| Character.isAlphabetic(c)) {
                filteredPal.append(c);
            }
        }
        String sb = new StringBuilder(filteredPal.toString()).reverse().toString();
        return sb.toString().equals(filteredPal.toString());
        }

}
