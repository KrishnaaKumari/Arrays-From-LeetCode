
public class IsPalindrome {
	
	public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0 ; i<s.length() ; i++)
        {
            if( ('a'<=s.charAt(i) && s.charAt(i)<='z') || ('0'<=s.charAt(i) && s.charAt(i)<='9'))
                str=str+s.charAt(i);
        }

        for(int i=0,j=str.length()-1 ; i<str.length()/2 ; i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false ;
        }
        return true ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));

	}

}
