import java.util.*;
class largestElement{
    int fun(int[] nums)
    {
        int lar=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            lar=nums[i]>lar ? nums[i] : lar;
        }
        return lar;
    }
    public static void main(String[] args)
    {
        largestElement obj=new largestElement();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result=obj.fun(nums);
        System.out.println(result);

    }
}