
public class JumpToLast1 {
	
	public static boolean canJump(int[] nums) {
        int rechable=0 ;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(i>rechable)
                return false ;
            rechable=Math.max(rechable,i+nums[i]);
        }
        return true ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] nums = {2,1,3,0,4};
		 System.out.println(canJump(nums));
	}

}
