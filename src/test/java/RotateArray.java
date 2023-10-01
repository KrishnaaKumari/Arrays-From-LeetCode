
public class RotateArray {

	public static int[] reverse(int s, int e, int[]arr)
    {
        while(s<e)
        {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t ;
            s++ ; e-- ;
        }
        return arr ;
    }
    public static void rotate(int[] nums, int k) {

        k=k%nums.length ;
        nums=reverse(0,nums.length-1,nums);
        nums=reverse(0,k-1,nums);
        nums=reverse(k,nums.length-1,nums);

        for(int i=0 ; i<nums.length ; i++)
        {
            System.out.print(nums[i]+" ");
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);

	}

}
