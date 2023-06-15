import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30); // push to stack in LIFO system
        System.out.println(stack);
        var top = stack.pop(); // item from top remove it
        System.out.println(top);
        stack.empty(); // tell us if the stack is empty
        top = stack.peek(); // get the result without remove it
        System.out.println(top);
    }
}
