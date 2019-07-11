package LeetCode;

/**
 * Created by tvp100 on 2019/7/11.
 */
public class No_14 {
    public static void main(String[] args){
        String[] strs = new String[]{"dog", "flow", "flight"};
        if(strs.length == 0)
            System.out.print("\"\"");
        String a = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(a) != 0){
                a = a.substring(0,a.length()-1);
                if(a.isEmpty()){
                    System.out.print("\"\"");
                    break;
                }
            }
        }
        System.out.print(a);
    }
}
