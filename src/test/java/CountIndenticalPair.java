import java.util.HashMap;

public class CountIndenticalPair {
	
	public static int numIdenticalPairs(int[] nums) {
		
		//timecomplexity: O(n)
        int cnt=0 ;
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                
                int c = hm.get(nums[i]);
                hm.put(nums[i],c+1);
                cnt=cnt+hm.get(nums[i])-1 ;
            }
        }
        return cnt;

      //timecomplexity: O(n^2)
        // int cnt=0;
        // for(int i=0 ; i<nums.length-1 ; i++)
        // {
        //     for(int j=i+1 ; j<nums.length ; j++)
        //     {
        //         if(nums[i]==nums[j])
        //             cnt++;
        //     }
        // }
        // return cnt;

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,1,1};
		System.out.println(numIdenticalPairs(nums));
		

	}

}
