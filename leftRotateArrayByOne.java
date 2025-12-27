import java.util.Scanner;

public class leftRotateArrayByOne {
    void fun(int[] nums)
    {
        int firstElement=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=firstElement;

        // printing updated nums array
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
public static void main(String[] args)
    {
        leftRotateArrayByOne obj=new leftRotateArrayByOne();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        obj.fun(nums);
    }
}