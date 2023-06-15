import java.util.Stack;

public class BalancedExpression {
    public boolean BalExp(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(isLeft(ch)){
                stack.push(ch);
            }
            if(isRight(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if(!bracketMatch(top, ch)) return false;
            }
        }
        return stack.empty();
    }
    private boolean isLeft(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }
    private boolean isRight(char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }
    private boolean bracketMatch(char left, char right) {
        return (right == ')' && left != '(' || right == '>' && left != '<' || right == ']' && left != '[' || right == '}' && left != '{') ;
    }
}
