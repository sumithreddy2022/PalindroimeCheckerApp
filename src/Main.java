import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class UseCase7PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:input.toCharArray()){
            deque.addLast(c);
        }
        boolean isPalindrome=true;
        while(deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}