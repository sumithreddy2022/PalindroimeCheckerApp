import java.util.*;
 class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
            stack.push(c);
        boolean isPalindrome = true;
        for (char c : s.toCharArray())
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}