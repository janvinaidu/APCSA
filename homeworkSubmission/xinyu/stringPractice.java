package apclass;

public class stringPractice {
	public String makeOutWord(String out, String word) {
	        String firstPart = out.substring(0, 2);
	        String lastPart = out.substring(2, 4);
	        return firstPart + word + lastPart;
	    }

	    
	    public String withoutEnd(String str) {
	        return str.substring(1, str.length() - 1);
	    }

	    
	    public boolean hasBad(String str) {
	        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
	            return true;
	        }
	        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
	            return true;
	        }
	        return false;
	    }

	    
	    public static void main(String[] args) {
	        stringPractice sp = new stringPractice();
	     
	        System.out.println(sp.makeOutWord("<<>>", "Yay"));   
	        System.out.println(sp.makeOutWord("<<>>", "WooHoo"));
	        System.out.println(sp.makeOutWord("[[]]", "word"));   

	     
	        System.out.println(sp.withoutEnd("Hello"));  
	        System.out.println(sp.withoutEnd("java"));  
	        System.out.println(sp.withoutEnd("coding")); 

	
	        System.out.println(sp.hasBad("badxx"));    
	        System.out.println(sp.hasBad("xbadxx"));  
	        System.out.println(sp.hasBad("xxbadxx")); 
	        System.out.println(sp.hasBad("ba"));       
	    }
	

}
