package LeetCode;

/**
 * Created by tvp100 on 2019/7/11.
 */
public class No_38 {
    public static void main(String[] args){
        int n = 4;
        if(n == 1)
            System.out.println("1");
        String str = "11";
        String rs = "";
        int tick = 1;
        for(int j = 3; j <= n; j++) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                    tick++;
                    if(i == str.length() - 2){
                        rs = rs + String.valueOf(tick) + str.substring(i, i + 1);
                        tick = 1;
                    }
                } else if (!str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                    rs = rs + String.valueOf(tick) + str.substring(i, i + 1);
                    if(i == str.length() - 2){
                        rs = rs + "1" + String.valueOf(str.substring(i+1,i+2));
                    }
                    tick = 1;
                }
            }
            str = rs;
            rs = "";
        }
        System.out.println(str);
        System.out.println(rs);
    }
}
