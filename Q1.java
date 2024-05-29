import java.util.*;
public class Q1 {
    public static boolean IsValid(String s){
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(map.get(stack.peek()) != s.charAt(i)){
                return false;
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(IsValid("[()]{}{[()()]()}"));
        System.out.println(IsValid("[(])"));
    }
}
