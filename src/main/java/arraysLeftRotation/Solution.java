package arraysLeftRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args)  {
    	
    	List<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)); 
    	List<Integer> ar2 = Result.rotLeft(4, ar);
        System.out.println(ar2);
    }
    

}