package LeetCode;

/**
 * Created by tvp100 on 2019/8/1.
 */
public class No_66 {
////自己的解法，很慢
//    public static void main(String[] args) {
//        int[] digits = {9};
//        int flag = 1;
//        int tick = 0;
//        Stack st = new Stack();
//        for (int i = digits.length-1; i > -1; i--){
//            if(flag==1){
//                if(i==0){
//                    if(digits[0]+1==10){
//                        st.push(0);
//                        st.push(1);
//                        tick+=2;
//                    }else if (digits.length==1){
//                        st.push(digits[i]+1);
//                        tick++;
//                    }else {
//                        st.push(digits[i]+1);
//                        tick++;
//                    }
//                }else if(digits[i]+1==10){
//                    st.push(0);
//                    tick++;
//                }else {
//                    st.push(digits[i]+1);
//                    flag = 0;
//                    tick++;
//                }
//            }else {
//                st.push(digits[i]);
//                tick++;
//            }
//        }
//        int[] plusOne = new int[tick];
//        tick = 0;
//        while (!st.empty()){
//            plusOne[tick] = (int)st.peek();
//            tick++;
//            st.pop();
//        }
//        for(int o: plusOne){
//            System.out.print(o);
//        }
//    }


//力扣大神解法
//class Solution {
//    public int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            digits[i]++;
//            digits[i] = digits[i] % 10;
//            if (digits[i] != 0) return digits;
//        }
//        digits = new int[digits.length + 1];
//        digits[0] = 1;
//        return digits;
//    }
//}


}
