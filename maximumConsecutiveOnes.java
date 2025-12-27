import java.util.Scanner;

public class maximumConsecutiveOnes {
    int fun(int[] nums)
    {  
        int max=0,current=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
            current+=1;
            max=Math.max(max,current);
            }
            else
            current=0;
        }
        return max;
    }
public static void main(String[] args)
    {
        maximumConsecutiveOnes obj=new maximumConsecutiveOnes();
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
