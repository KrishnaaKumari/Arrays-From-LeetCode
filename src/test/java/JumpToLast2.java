
public class JumpToLast2 {
	
	public static int jump(int[] nums) {

        int jump=0, rechable=0;
        int currend=0 ;
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            
            rechable=Math.max(rechable,i+nums[i]);
            if(currend==i)
            {
                currend=rechable ;
                jump++ ;
            }

        }
        return jump ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,1,3,0,4};
		 System.out.println(jump(nums));

	}

}
