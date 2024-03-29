package fr.voxi.admin;

public class AppAdmin {
	
	public static void main(String[] args) {
		Evaluation eval1 ;
		eval1 = new Evaluation(1, 5, "Excellent !!", 23, "Evaluation validee") ;
		System.out.println( eval1.toString() ) ;
		
		eval1.AjoutDUnJAime(1);
		System.out.println( "Un lecteur vient d'indiquer qu'il aime l'évaluation numéro " + eval1.getNumero() + ".") ;
		
		System.out.println( "Nombre de 'J'aime' de l'évaluation numéro " + eval1.getNumero() + " : " + eval1.getNombreDeJAime()) ;
		
		Evaluation eval2 ; 
		eval2 = eval1 ; 
		
		System.out.println( eval2.toString() ) ;
		System.out.println( eval1.toString() ) ;
		
		System.out.println( "Réf. Eval. n° 1 : " + eval1.hashCode() ) ;
		System.out.println( "Réf. Eval. n° 2 : " + eval2.hashCode() ) ;
	
	}
}
