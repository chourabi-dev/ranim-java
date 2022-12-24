package tdrev;

public class EtudiantAlternance extends Etudiant {

	private int salaire;
	
	public EtudiantAlternance(){
		
	}
	
	
	public int getSalaire() {
		return salaire;
	}


	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	
	
	
	

	public EtudiantAlternance(int idantifiant, String nom, String prenom, float moyenne , int salaire) {
		super(idantifiant,nom,prenom,moyenne); 
		this.salaire = salaire;
	}


	@Override
	public void ajouterUneAbsence() {
		
		this.setSalaire(   this.getSalaire() - 50   );
	}
	
	
	
	public String toString() {
		return this.getNom().concat(" ").concat( this.getPrenom() ).concat( " salair => " ).concat( Integer.toString(this.getSalaire()) );
	}

}
