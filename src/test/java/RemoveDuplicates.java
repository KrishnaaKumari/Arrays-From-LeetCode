import java.util.HashSet;

public class RemoveDuplicates {
	
	 public static int removeDuplicates(int[] nums) {
	        HashSet<Integer> hm = new HashSet<Integer>();
	        int j=0 ;
	        int cnt=0;
	        for(int i=0 ; i<nums.length ; i++)
	        {
	            if(!hm.contains(nums[i]))
	            {
	                nums[j]=nums[i];
	                j++ ;
	                cnt++ ;
	                hm.add(nums[i]);
	            }
	        }
	        return cnt ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,1,1,1,2,3,3};
		int c = removeDuplicates(nums);
		System.out.println(c);

	}

}
