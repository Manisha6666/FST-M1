package activities;

public class Activity4 {
    public static void main(String[] args)
    {
        int[] nums = {2,10,5,1,9,4};
        for(int num : nums)
        {
            System.out.println("Unsorted array :"+num);
        }
        for(int i=1;i<nums.length;i++)
        {
           for(int j=0;j<i;j++)
           {
               if(nums[i]<nums[j])
               {
                   int temp = nums[j];
                   nums[j] = nums[i];
                   nums[i] = temp;
               }
           }
        }
        for(int num : nums)
        {
            System.out.println("Sorted array :"+num);
        }
    }
}
