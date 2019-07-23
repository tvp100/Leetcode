package LeetCode;

import java.util.Stack;

/**
 * Created by tvp100 on 2019/7/23.
 */
public class No_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = 0;
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        if(nums.length == 0 || nums ==null){
            //return k;
        }
        for (int i = 1; i < nums.length; i++) {
            if(st.peek()!=nums[i]){
                st.push(nums[i]);
            }
        }
        for (Integer o: st) {
            nums[k] = o;
            k++;
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println(k);
    }
}
