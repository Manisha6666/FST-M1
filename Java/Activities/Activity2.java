package activities;

public class Activity2 {
    public static void main(String[] args)
    {
        int [] nums = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for(int num : nums)
        {
            if(num == 10)
            {
                sum = sum + num;
            }
        }
        boolean res = result(sum);
        System.out.println("Result :"+res);
    }
    public static boolean result(int sum)
    {
        if(sum == 30)
            return true;
        return false;
    }
}
