
public class ProductOfArray {
	
	public static int[] productExceptSelf(int[] nums) {

        int prod=1;
        int cnt=0 ;//count zeroes
        int [] res = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]!=0)
            prod=prod*nums[i];
            else{
                cnt++;//cnt zeroes
            }
        }
        if(cnt==0)//no zeroes
        {
            for(int i=0 ; i<nums.length ; i++)
                res[i]=prod/nums[i];
        }
        else if(cnt==1)
        {
            for(int i=0 ; i<nums.length ; i++)
            if(nums[i]==0)
                res[i]=prod ;
        }
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,4,0};
		int []res=productExceptSelf(nums);
		for(int i=0 ; i<res.length ; i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
