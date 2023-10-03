import java.util.*;

public class PascalTriangle {
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer>firstrow= new ArrayList<Integer>();
        firstrow.add(1);
        ans.add(firstrow);
        for(int i=1 ; i<numRows ; i++)
        {
            List<Integer>prevrow=ans.get(i-1);
            List<Integer>row=new ArrayList<Integer>();
            row.add(1);
            for(int j=1 ; j<i ; j++)
            row.add(prevrow.get(j)+prevrow.get(j-1));
            row.add(1);
            ans.add(row);
        }
        return ans ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=3;
		List<List<Integer>> ans=generate(rows);
		for(List<Integer> ls:ans)
		{
			for(Integer i : ls)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
