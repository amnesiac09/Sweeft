package IsPalindrome;

public class IsPalindrome {
    public boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) return false;
        }
        return true;
    }
}
