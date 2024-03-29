package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		
		
		AudioBook [] lesAudiobooks = {
				
				new AudioBook( 1 , "Français" , 15 ) ,
				new AudioBook( 2 , "Anglais" , 20 ) ,
				new AudioBook( 3 , "Français" , 10 ) ,
				new AudioBook( 4 , "Français" , 8 ) ,
				new AudioBook( 5 , "Allemand" , 33 ) ,
				new AudioBook( 6 , "Allemand" , 10 ) ,
				new AudioBook( 7 , "Anglais" , 15 ) ,
				new AudioBook( 8 , "Français" , 20 )
				
		} ;
		
		
		System.out.println( "\n\n----[ Question 3.4 ]----\n" ) ;
		visualiserAB( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.5 ]----\n" ) ;
		visualiserLangueAB( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.6 ]----\n" ) ;
		visualiserLangueABMaj( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.7 ]----\n" ) ;
		int nbABenFr = calculerNbABEenFrancais( lesAudiobooks ) ;
		System.out.println( "Nombre d'audios en français : " + nbABenFr ) ;
		
		
		System.out.println( "\n\n----[ Question 3.8 ]----\n" ) ;
		visualiserNbMaxChapitres( lesAudiobooks ) ;
		
	}
	
	
	private static void visualiserAB( AudioBook [] lesABooks ) {
		// Question 3.4 : Votre code ici
		
		for( int i = 0 ; i < lesABooks.length ; i ++ ) {
			System.out.println( lesABooks[i] ) ;
		}
		
	}
	
	
	private static void visualiserLangueAB( AudioBook [] lesABooks ) {
		// Question 3.5 : Votre code ici
		
	}
	

	private static void visualiserLangueABMaj( AudioBook [] lesABooks ) {
		// Question 3.6 : Votre code ici
		
	}
	
	
	private static int calculerNbABenFrancais( AudioBook [] lesABooks ) {
		int nbABooksFr = 0 ;
		
		// Question 3.7 : Votre code ici
		
		return nbABooksFr ;
	}
	
	
	private static void visualiserNbMaxChapitres( AudioBook [] lesABooks ) {
		// Question 3.8 : Votre code ici
		
	}

}
