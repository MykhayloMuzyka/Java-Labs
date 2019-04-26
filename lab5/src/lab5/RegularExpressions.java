package lab5;

public class RegularExpressions {
	public static boolean matchesDate(String date) {
		if(date.matches("(20[12][0-9])\\.(0[1-9]|1[012])\\.(0[1-9]|[12][0-9]|3[01])")) {        	
        	return true;
        }    	
        else {       	        
        	return false;
        }
	}
	public static boolean matchesTime(String time) {
		if(time.matches("([01][0-9]|2[0-4]):([0-5][0-9])")) {      	
        	return true;
        }    	
        else {       	      
        	return false;
        }
	}
}