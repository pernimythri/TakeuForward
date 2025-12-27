import java.util.*;
class Main{
    int largestElement(int[] nums)
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
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result=obj.largestElement(nums);
        System.out.println(result);

    }
}