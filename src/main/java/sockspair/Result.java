package sockspair;
import java.util.*;


class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    int result = 0;
    Set<Integer> setResult = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			int color = ar.get(i); 
			if(setResult.contains(color)) {
				result++;
				setResult.remove(color);
			} else {
				setResult.add(color);
			}
		}
		return result;
    }
}
