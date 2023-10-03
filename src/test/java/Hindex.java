import java.util.Arrays;

public class Hindex {
	
	public static int hIndex(int [] c)
	{
		Arrays.sort(c);
		int idx=0 ;
		int len=c.length ;
		while(idx<len && len-idx>c[idx])
			idx++ ;
		return len-idx ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] c= {1,8,9,10};
		System.out.println(hIndex(c));

	}

}
