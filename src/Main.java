import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
 class UseCase6PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Queue<Character> queue=new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        for(char c:input.toCharArray()){
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome=true;
        while(!queue.isEmpty()){
            if(queue.remove()!=stack.pop()){
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