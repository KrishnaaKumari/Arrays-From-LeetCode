import java.util.Stack ;
public class Find123Pattern {
	
public static boolean find132pattern(int[] nums) {
        
 /* brute force

         if(nums.length==0||nums.length==1)
         {
             return false ;
         }
         if(nums.length==2)
         {
           return false ;
         }
         boolean ans=false ;
         if(nums.length>=3)
         {
             for(int i=0 ; i<nums.length-2 ; i++)
             {
                 for(int j=i+1 ; j<nums.length-1 ; j++)
                 {
                     for(int k=j+1 ; k<nums.length ; k++)
                     {
                         if(nums[i]<nums[k]&&nums[k]<nums[j])
                         {
                             ans=true ;
                             return ans ;
                         }
                     }
                 }
             }
         }
         return ans ;
*/
	
        //optimised method
	
        Stack<Integer> stack = new Stack<Integer>();
        int third = Integer.MIN_VALUE;
        for(int i=nums.length-1 ; i>=0 ; i--)
        {
            if(nums[i]<third)
                return true ;
            while(!stack.isEmpty() && nums[i]>stack.peek())
            {
                third=stack.pop();
            }
            stack.push(nums[i]);
        }
        return false ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4};
		boolean ans = find132pattern(arr);
		System.out.println(ans);

	}

}
