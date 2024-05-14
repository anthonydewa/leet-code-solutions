class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);

        boolean palindrome = true;
        int size = xString.length();
        for (int i = 0; i < size / 2; i++) {
            char a = xString.charAt(i);
            char b = xString.charAt(size - 1 - i);

            if (a != b) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }
}