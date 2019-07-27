package LeetCode;

/**
 * Created by tvp100 on 2019/7/26.
 */
public class No_70 {
    //递归超出时间限制
//    public static void main(String[] args) {
//        int tick = 0;
//        No_70 p = new No_70();
//        tick = p.pa(0,3);
//        System.out.println(tick);
//    }
//    public int pa(int i, int n){
//        if(i>n)
//            return 0;
//        if(i==n)
//            return 1;
//        return pa(i+1,n) + pa(i+2,n);
//    }


    //为什么这样改进就可以了

    //改进
//        public static void main(String[] args) {
//        int tick = 0;
//        int[] temp = new int[4];//数组大小对应n+1
//        No_70 p = new No_70();
//        tick = p.pa(0,3,temp);
//        System.out.println(tick);
//    }
//    public int pa(int i, int n, int temp[]){
//        if(i>n)
//            return 0;
//        if(i==n)
//            return 1;
//        if(temp[i] > 0)
//            return temp[i];
//        temp[i] = pa(i+1,n,temp) + pa(i+2,n,temp);
//        return temp[i];
//    }


    //动态规划
    public static void main(String[] args) {
        int n = 5;
        if (n==1){
//            return 1;
        }
        int[] dp = new int[6];  //数组长度为n+1
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
//        return dp[n];
    }

}
