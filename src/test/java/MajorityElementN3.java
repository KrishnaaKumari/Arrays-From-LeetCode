import java.util.* ;
public class MajorityElementN3 {
	
	public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
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
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> ele : hm.entrySet())
        {
            if(ele.getValue()>nums.length/3)
            ans.add(ele.getKey());
        }
        return ans ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {3,2,3};
		List<Integer> ans = new ArrayList<Integer>();
		ans=majorityElement(nums);
		for(Integer i : ans)
		{
			System.out.print(i+" ");
		}

	}

}
