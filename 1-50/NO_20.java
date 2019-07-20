package LeetCode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by tvp100 on 2019/7/16.
 */
public class NO_20 {
    public static void main(String[] args){
        String s = "(){}[]";
        int length = s.length();
        Stack st = new Stack();
        HashMap<Character,Character> maps = new HashMap<>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        for(int i = 0; i < length; i++){
            if(!st.empty()&&maps.get(s.charAt(i))==st.peek()){
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }
        if(st.empty()){
//            return true
        }else {
//            return false
        }

    }
}
