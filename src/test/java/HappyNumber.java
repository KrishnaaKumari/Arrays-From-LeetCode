import java.util.* ;
public class HappyNumber {
	
	public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n!=1 && !set.contains(n))
        {
            int sum=0 ;
            set.add(n);
            while(n!=0)
            {
                int dig=n%10 ;
                sum=sum+dig*dig ;
                n=n/10 ;
            }
            n=sum ;
        }
        if(n==1) return true ;
        else 
        return false ;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
