import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue <Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        // Queue [ 10 -> 20 -> 30 ]
        // Stack [ 10 -> 20 -> 30 ]
        // Queue2 [ 30 -> 20 -> 10 ]

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
