package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheGenerator {

	// the Arrays
	private static String[] a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private static String[] b = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private static String[] c = {"1","2","3","4","5","6","7","8","9","0"};
    private static String[] d = {"§","$","&","/","?","!","@","€"};
    
    
	public TheGenerator() {
		
	}
		
	
	public static String produce(boolean cbaz,boolean cbAZ, boolean cb09,boolean cbsz, boolean rb8, boolean rb12, boolean rb16){
		
		List<String> yourPassword= new ArrayList<>(); // the whole List
		List<String> genPass = new ArrayList<>(); // the generatet List
		
		//Check if a checkboxx checked
		if(!cbaz&!cbAZ&!cb09&!cbsz){
			return "Bitte eine Checkbos Auswählen!!!";
		}
		if(cbaz)
			yourPassword.addAll(Arrays.asList(b));
		if(cbAZ)
			yourPassword.addAll(Arrays.asList(a));
		if(cb09)
			yourPassword.addAll(Arrays.asList(c));
		if(cbsz)
			yourPassword.addAll(Arrays.asList(d));	
											
		//System.out.println("In GENERATOR-->before"+yourPassword);
		Collections.shuffle(yourPassword);
		//System.out.println("In GENERATOR-->"+yourPassword);
		
		// RadioButton Check		
		if(rb8){
			genPass=yourPassword.subList(0, 8);
			//System.out.println("In GENERATORRB8 GenPass-->"+genPass);
		}else if(rb12){
			genPass = yourPassword.subList(0, 12); // eine SubList erzeugen mit der gewünschten Anzahl an Zeichen			
		}else if(rb16){
			genPass = yourPassword.subList(0, 16);				
		}else{
			return "Really Here";
		}
		
		// Form a List in a String looks better
		String thePassword ="";
		for (String s : genPass) {
			thePassword+=s;
		}
		System.out.println(thePassword);
		return thePassword;

		
	}

}
