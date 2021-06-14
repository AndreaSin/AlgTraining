package timeConversion;
import java.util.*;


//	05:15:00PM

class Result {

    public static String timeConversion(String s) {
    	String result = "";
    	
    	int hh = Integer.parseInt(s.substring(0, 2));
    	int mm = Integer.parseInt(s.substring(3, 5));
    	int ss = Integer.parseInt(s.substring(6, 8));
    	
    	int hhRes = hh;
    	int mmRes = mm;
    	int ssRes = ss;
    	
    	String amPm = s.substring(8, 10);
    	
    	if(amPm.equals("PM") && hh != 12) {
    		hhRes = hh + 12; 		
    	}
    	
    	if(amPm.equals("AM") && hh == 12) {
    		hhRes = 00; 		
    	}
    	
    	result = padNumber(hhRes) + ":" + padNumber(mmRes) + ":" + padNumber(ssRes);
    	System.out.println(result);
    	return result;
    }
    
    
    public static String padNumber(int n) {
    	String result = "";
    	result = String.format("%02d", n);  
    	return result;
    }
}
