import java.util.*;

public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums)
	{
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0 ; i<nums.length ; i++)
		{
			int j=i+1, k=nums.length-1 ;
			while(j<k)
			{
				int sum=nums[i]+nums[j]+nums[k];
				if(sum==0)
				{
					set.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++ ; k-- ;
				}
				else if(sum<0) j++ ;
				else k-- ;
			}
			
		}
		ans.addAll(set);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSum(nums);
		for(List<Integer> li : ans)
		{
			for(Integer i : li)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
