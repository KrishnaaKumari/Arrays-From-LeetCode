
public class MedianOfTwoSortedArray {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length ;
        int n2=nums2.length ;
        int i=0 , j=0 ,k=0;
        int [] arr = new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                k++ ; i++ ;
            }
            else{
                arr[k]=nums2[j];
                k++ ; j++ ;
            }
        }
       
        while(i!=n1)
        {
            arr[k]=nums1[i] ; i++ ; k++ ;
        }
       
        while(j!=n2)
        {
            arr[k]=nums2[j] ; j++ ; k++ ;
        }
       

        double median=0  ;
        if(arr.length%2==0)
        {
            median=(double)(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        else{
            median=(double)(arr[arr.length/2]) ;
        }
        return median ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1= {1,3};
		int []nums2= {2};
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}

}
