package harf_notes;

import java.util.Scanner;

// Merhaba hocam I don't exactly what to do in this code
// because I have tried to ask my friends on dicord about ..
// homework but no-one made a explanation about 
// for this reason according to my understanding in order not to pass the deadline 
// I am doing my best to get this homework done

public class Harf_notu_karsiligi {

	// creatd by  muyeeed4
	
	public static void main(String[] args) {

		System.out.print("Enter your note to take the Harf_notu_karsiligi " );
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" your result is " + getLetterGradeEquivalent(scan.nextInt())); 

	}
	
	public static String getLetterGradeEquivalent(double Grade) 
	{
		if(Grade < 50  && Grade >= 0 )
			return "FF"; 
		else if(Grade == 50 && Grade <= 60  )
			return "CC"; 
		else if(Grade >60 && Grade <= 70 ) 
			return "BB"; 
		else if(Grade >70 && Grade <= 100)
			return "AA"; 
		else 
			return "your input mark invalid"; 
	}

}
