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
		
		for( int i = 0 ; i < lesABooks.length ; i ++) {
			System.out.println( lesABooks[i].toString() ) ; 
		}
	}
	
	
	private static void visualiserLangueAB( AudioBook [] lesABooks ) {
		// Question 3.5 : Votre code ici
		
		for( int i = 0 ; i < lesABooks.length ; i ++) {
			System.out.println( lesABooks[i].getLangue()) ; 
		}
	}
	

	private static void visualiserLangueABMaj( AudioBook [] lesABooks ) {
		// Question 3.6 : Votre code ici
		
		for( int i = 0 ; i < lesABooks.length ; i ++) {
			String langue = lesABooks[i].getLangue() ; 
			System.out.println( langue.toUpperCase() ) ; 
		}
		
	}
	
	
	private static int calculerNbABEenFrancais( AudioBook [] lesABooks ) {
		int nbABooksFr = 0 ;
		
		// Question 3.7 : Votre code ici  
		
		for( int i = 0 ; i < lesABooks.length ; i++) {
			if( lesABooks[i].getLangue() == "Français" ) {
				nbABooksFr += 1 ;
			}
		}
		
		return nbABooksFr ;
		
	}
	
	
	private static void visualiserNbMaxChapitres( AudioBook [] lesABooks ) {
		// Question 3.8 : Votre code ici
		
		if(lesABooks.length > 0) {
			int nbMaxChapitres = 0 ;
			for(int i = 0 ; i < lesABooks.length ; i++) {
				if( lesABooks[i].getNbChapitres() > nbMaxChapitres ) {
					nbMaxChapitres = lesABooks[i].getNbChapitres() ; 
				}
			}
			System.out.println( nbMaxChapitres ) ;
		}
		else {
			System.out.println( "Aucun audiobook recensé. " ) ;
		}
	}

}
