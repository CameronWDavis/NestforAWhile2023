import java.util.Scanner;
import java.util.Stack;

public class ProgramG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] split = input.split("\s+");
            if(split[0].equals("Sleep")){
                stack.push(split[1]);
            }
            if (split[0].equals("Test")) {
                if (stack.isEmpty()) {
                    System.out.println("Not in a dream");
                } else {
                    System.out.println(stack.peek());
                }
            }// end if for first
            if(split[0].equals("Kick")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }

        }//end for
    }
}
