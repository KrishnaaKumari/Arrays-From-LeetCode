import java.util.HashMap;

public class TwoSum2 {
	
	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        int[]ans=new int[2];
        for(int i=0 ; i<numbers.length ; i++)
        {
            if(!hs.containsKey(target-numbers[i]))
            {
                hs.put(numbers[i],i+1);
            }
            else{
                ans[1]=i+1;
                ans[0]=hs.get(target-numbers[i]);
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
