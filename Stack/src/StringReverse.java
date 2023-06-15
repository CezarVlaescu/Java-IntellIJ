import java.util.Stack;

public class StringReverse {
    public static String Reversed(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
        } // or
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
