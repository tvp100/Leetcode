package LeetCode;

/**
 * Created by tvp100 on 2019/7/23.
 */
public class No_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = 2;
        if(nums.length==0 || nums==null){
            //return k;
        }
        if(nums.length==1)
            //return 1;
        if(nums.length==2)
            //return 2;
        for(int i = 2; i < nums.length; i++){
            if (nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }

        for (Integer o: nums) {
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println(k);
        System.out.println("*"+nums[nums.length-1]);
    }
}
