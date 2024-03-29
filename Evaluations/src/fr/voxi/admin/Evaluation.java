package fr.voxi.admin;

public class Evaluation {
	
	private int numero ; 
	private int note ; 
	private String commentaire ; 
	private int nombreDeJAime ; 
	private String validee ; 
	
	public Evaluation(int numero, int note, String commentaire, int nombreDeJAime, String validee) {
		this.numero = numero ; 
		this.note = note ; 
		this.commentaire = commentaire ; 
		this.nombreDeJAime = nombreDeJAime ; 
		this.validee = validee ; 
	}
	
	public Evaluation(int numero, int note, String commentaire) {
		this.numero = numero ; 
		this.note = note ; 
		this.commentaire = commentaire ;
	}
	
	public int getNumero() {
		return numero ; 
	}
	
	public void setNumero(int numero) {
		this.numero = numero ; 
	}
	
	public int getNote() {
		return note ;
	}
	
	public void setNote( int note) {
		this.note = note ; 
	}
	
	public String getCommentaire() {
		return commentaire ;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire ; 
	}
	
	public int getNombreDeJAime() {
		return nombreDeJAime ;
	}
	
	public void setNombreDeJAime( int nombreDeJAime) {
		this.nombreDeJAime = nombreDeJAime ; 
	}
	
	public String getValidee() {
		return validee ;
	}

	public void setValidee(String validee) {
		this.validee = validee ; 
	}
	
	public void AjoutDUnJAime( int un_jaime) {
		nombreDeJAime = nombreDeJAime + un_jaime ; 
	}
	
	public String toString() {
		return "Evaluation[" + numero + ", " + note + ", " + commentaire + ", " + nombreDeJAime + ", " + validee + "]" ; 
	}
}
