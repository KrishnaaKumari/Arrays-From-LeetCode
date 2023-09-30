
public class MonotonicArray {
	
	public static boolean isMonotonic(int[] nums) {
        boolean inc=false ;
        boolean dec=false ;
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            if(nums[i]==nums[i+1])
                continue ;

            if(nums[i]<nums[i+1])
            { 
                if(dec==true)
                    return false ;
                inc=true ;
            }
            else
            {
                if(inc==true)
                    return false ;
                dec=true ;
            }
        }
        return true ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,7,5};
		boolean ans= isMonotonic(arr);
		System.out.println(ans);

	}

}
