public class PalindromeCheckerApp {
    public static void main(String[] args) {

        WelcomeMessage.showMessage();
        PalindromeCheck.checkPalindrome();
        PalindromeReverse.checkPalindrome("level");
        PalindromeStack.checkPalindrome();

        PalindromeCharArray.checkPalindrome();

        PalindromeQueueStack.checkPalindrome();
        PalindromeDeque.checkPalindrome();

    }
