package sumNumber;


class Result {

    public boolean isPalindrome(int n) {
 
    	String numToString = Integer.toString(n);
   
    	String numeroDaVerificare = sommaCifre(numToString);
    	String numeroRibaltato = ribaltaNumero(numeroDaVerificare);
    	
    	if(numeroDaVerificare.equals(numeroRibaltato)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
    private String sommaCifre(String n) {
    	int sum = 0;
    	for (char c  : n.toCharArray()) {	
			sum += Integer.parseInt(String.valueOf(c));
		}
		return Integer.toString(sum);
    }
    

    private String ribaltaNumero(String n) {
    	String numRibaltato = "";	
    	for(int i = n.length() -1; i >= 0; i--) {
    		numRibaltato += n.charAt(i);
    	}
		return numRibaltato;
    }

}
