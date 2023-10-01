
public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
        int i=0 ;
        int j=nums.length-1 ;
        int cnt=0 ;
        while(i<=j)
        {
            if(nums[i]==val)
            {
                nums[i]=nums[j];
                j-- ;
                cnt++ ;
            }
            else{
                i++ ;
            }
            
        }
        return nums.length-cnt ;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,2,3,0,4,2};
		int val=2 ;
		int n=removeElement(arr,val);
		System.out.println(n);

	}

}
