import java.util.Scanner;

public class secondLargestElement {
    int fun(int[] nums)
    {
        int lar=nums[0];
        int secondLar=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>lar)
            {
                secondLar=lar;
                lar=nums[i];
            }
            else if(nums[i]!=lar && nums[i]>secondLar)
            {
                secondLar=nums[i];
            }
        }
        return secondLar;
    }
 public static void main(String[] args)
    {
        secondLargestElement obj=new secondLargestElement();
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
