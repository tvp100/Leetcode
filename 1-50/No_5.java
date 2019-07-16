package LeetCode;

/**
 * Created by tvp100 on 2019/7/16.
 */
public class No_5 {
    //方法简介
    //先选中一个值，然后依此向外展开
    public static void main(String[] args){
        String s = "babad";
        String result = longString(s);
        System.out.println(result);
    }

    private static String longString(String s){
        if(s.length()<1 || s==null){
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            int len1 = Exp(s,i,i);
            int len2 = Exp(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int Exp(String s, int left, int right){
        int L = left;
        int R = right;
        while (L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
