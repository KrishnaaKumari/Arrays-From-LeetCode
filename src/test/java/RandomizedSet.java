
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class RandomizedSet {
     Set<Integer> array ;

    public RandomizedSet()
    {
        array = new HashSet<Integer>(); 
    }
    
    public boolean insert(int val)
    {
        if(!array.contains(val))
        {
            array.add(val);
            return true ;
        }
        return false ;
    }
    
    public boolean remove(int num)
    {
        if(array.contains(num))
        {
            array.remove(num);
            return true ;
        }
        return false ;
    }
    
    public int getRandom()
    {
        ArrayList<Integer> list = new ArrayList<Integer>(array);
        int r = (int)(Math.random()*array.size());
        return list.get(r);
    }
}



/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
