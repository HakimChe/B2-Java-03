package fr.voxi.admin;

public class Lecteur {
		
		private int numero ; 
		private String nom = "" ; 
		private String prenom = "" ; 
		private int nombre_audiobooks = 0 ;
		
		public Lecteur(int numero, String nom, String prenom, int nombre_audiobooks) {
			this.numero = numero ; 
			this.nom = nom ; 
			this.prenom = prenom ; 
			this.nombre_audiobooks = nombre_audiobooks ; 
			
		}
		
		public Lecteur(int numero, String nom, String prenom) {
			this.numero = numero ; 
			this.nom = nom ; 
			this.prenom = prenom ; 
		}
		
		public int getNumero() {
			return numero ;
		}
		
		public void setNumero( int numero) {
			this.numero = numero ; 
		}
		
		public String getNom() {
			return nom ;
		}

		public void setNom(String nom) {
			this.nom = nom ; 
		}
		
		public String getPrenom() {
			return prenom ;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom ; 
		}
		
		public int getNombre_Audiobooks() {
			return nombre_audiobooks ;
		}
		
		public void setNombre_Audiobooks( int nombre_audiobooks) {
			this.nombre_audiobooks = nombre_audiobooks ; 
		}

		public String toString() {
			return "Lecteur[" + numero + "," + nom + "," + prenom + "," + nombre_audiobooks + "]" ;
		}
		
		public boolean estActif () {
			if( nombre_audiobooks >= 10 ) {
				return true ;
			}
			else {
				return false ; 
			}
		}
		
		public void produireUnAudioBooks ( int nv_audiobooks ) {
			nombre_audiobooks = nombre_audiobooks + nv_audiobooks ; 
		}
	
}
