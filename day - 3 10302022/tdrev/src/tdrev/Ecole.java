package tdrev;

import java.util.List;

public class Ecole {

	private String nom;
	
	public int count = 0;
	
	private Etudiant[] etudiants;
	
	
	public Ecole(String nom) {
		this.nom = nom;
		etudiants = new Etudiant[500];
	}
	
	
	
								
	public Etudiant[] getEtudiants() {
		return etudiants;
	}




	public void setEtudiants(Etudiant[] etudiants) {
		this.etudiants = etudiants;
	}




	public void ajouterEtudiant( Etudiant e ) {
		if( count < 500 ) {
			etudiants[count] = e;
			count++;
			
		}
	}
	
	
	
	public int rechercherEtudiant (Etudiant e) {
		
		for(int i = 0; i < count; i++ ) {
			etudiants[i].equals(e);
			return i;
		}
		
		return -1;
	}
	
	
	
	public float getMoyenneDes3A() {
		float total = 0;
		
		for(int i = 0; i < count; i++ ) {
			total = total + etudiants[i].getMoyenne(); 
		}
		
		
		return total / count;
	}
	
	
	
	public String toString() {
		String res= this.nom.concat(" : ");
		
		
		
		for(int i = 0; i < count; i++ ) {
			
			System.out.println( etudiants[i].getNom().concat(" ").concat( this.etudiants[i].getPrenom() ) );
		}
		
		
		return res;
		
		
	}
	
	
	
}
