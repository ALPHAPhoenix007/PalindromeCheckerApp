public class PalindromeCheck {

    public static void checkPalindrome() {

        String word = "madam";   // Hardcoded value

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}