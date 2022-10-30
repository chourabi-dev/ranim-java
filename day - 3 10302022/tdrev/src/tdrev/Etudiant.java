package tdrev;

public  abstract class   Etudiant {
	
	private int idantifiant;
	private String nom;
	private String prenom;
	private float moyenne;
	
	
	public int getIdantifiant() {
		return idantifiant;
	}
	public void setIdantifiant(int idantifiant) {
		this.idantifiant = idantifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	
	
	
	public Etudiant() {
		super();
	}
	public Etudiant(int idantifiant, String nom, String prenom, float moyenne) {
		super();
		this.idantifiant = idantifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
	}
	
	
	public String toString() {
		return this.nom.concat(" ").concat( this.prenom );
	}
	
	
	public boolean equals(Etudiant etudiant) {
		
		if( this.idantifiant == etudiant.getIdantifiant() ) {
			if(  this.nom.equals( etudiant.getNom() ) == true  ) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	
	
	public abstract void ajouterUneAbsence();
	

}
