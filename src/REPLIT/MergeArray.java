package REPLIT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static int[] merge(int[] a,int[] b) {
        int []nums3=new int[a.length+b.length];
        for (int i = 0,j=0; i <nums3.length ; i++,j++) {
            nums3[i]=a[j];
        }
for(int i=0;i<b.length;i++){
    nums3[a.length+i]=b[i];
}




        return nums3;







    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
