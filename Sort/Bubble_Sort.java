package Day7_12;

/**
 * Created by tvp100 on 2019/7/12.
 */
public class Bubble_Sort {
    //冒泡排序
    public static void main(String[] args){
        int[] nums = {31,25,81,76,17};
        int length = nums.length;
        int temp = 0;               //临时储存
        for(int i = length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){            //左右两个比较，把大的放在右边
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
