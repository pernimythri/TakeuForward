import java.util.*;

public class isSorted {
    boolean fun(ArrayList<Integer>nums)
    {
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums.get(i)>nums.get(i+1))
                return false;
        }
        return true;
    }
    
 public static void main(String[] args)
    {
        isSorted obj=new isSorted();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nums.add(sc.nextInt());
        }
        boolean result=obj.fun(nums);
        System.out.println(result);
    }
}