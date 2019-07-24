package LeetCode;

/**
 * Created by tvp100 on 2019/7/24.
 */
public class No_459 {
    //此解答超出了时间限制！！！！！！！！！！！！！
    //详情见MD文件
    public static void main(String[] args) {
        String s = "ababab";
        if(s.length()==1 || s.length()==0){
//            return false;
        }
        boolean rs = false;
        String a = "false";
        int length = s.length()/2;
        for(int i = length; i > 0; i--){
            String temp = s.substring(0,i);
            String st = "";
            if(s.length()%temp.length() == 0){
                int lt = s.length()/temp.length();
                for(int j = 0; j < lt; j++){
                    st += temp;         //这种拼接字节串的方式占用大量内存和空间，会不停的创建新的字符串
                }
                if (s.equals(st)){
                    rs = true;
                    a = "true";
                    break;
                }
            }
        }
//        return rs;
        System.out.println(a);
    }
}
