package arraysLeftRotation;
import java.util.*;



class Result {

    public static List<Integer> rotLeft( int d, List<Integer> a) {
    		
    	for(int i = 0 ; i < d ; i++) {
    		int num = a.remove(0);
    		a.add(num);
    	}
    		
		return a;
    }
    

}
