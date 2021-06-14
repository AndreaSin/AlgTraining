package pepeatedString;
import java.util.*;


class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	
    	
    	long size = s.length();
    	long rep = n/size;
        int count = 0;
        
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
            	++count;
            }
        }
    	
    	long module = n % size;
    	
    	

    	return count;	
    }

}
