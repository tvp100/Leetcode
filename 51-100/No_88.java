package LeetCode;

import java.util.Arrays;

/**
 * Created by tvp100 on 2019/7/20.
 */
public class No_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int j = 0;
        for (int i = nums1.length-1;i>nums1.length-nums2.length-1;i--){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        for (Object s:nums1) {
            System.out.println(s);
        }
    }
}
