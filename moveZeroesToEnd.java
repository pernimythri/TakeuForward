import java.util.Scanner;

public class moveZeroesToEnd {
    int[] fun(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j+=1;
            }
        }
        for(int rem=j;rem<nums.length;rem++)
        {
            nums[rem]=0;
        }
        return nums;
    }
public static void main(String[] args)
    {
        moveZeroesToEnd obj=new moveZeroesToEnd();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] resultArray=obj.fun(nums);
        for(int i=0;i<resultArray.length;i++)
        {
            System.out.print(resultArray[i]+" ");
        }
    }
}
