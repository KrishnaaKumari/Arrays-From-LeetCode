
public class SortArrayByParity {
	
	public static void swap(int e, int o, int[]arr)
    {
        int temp=arr[e];
        arr[e]=arr[o];
        arr[o]=temp ;
    }
    public static int[] sortArrayByParity(int[] nums) {
        int e=0;
        int o=nums.length-1 ;
        while(e<=o)
        {
            if(nums[e]%2==0)
                e++ ;
            else 
            {
                swap(e,o,nums);
                o-- ;
            }
        }
        return nums ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,0,3};
		num=sortArrayByParity(num);
		for(int i=0 ; i<num.length ; i++)
		{
			System.out.print(num[i]+" ");
		}

	}

}
