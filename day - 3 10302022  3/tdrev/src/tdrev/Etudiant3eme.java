package tdrev;

public class Etudiant3eme extends Etudiant {

	private String branche;
	
	public Etudiant3eme() {
		
	}
	
	
	
	public String getBranche() {
		return branche;
	}




	public Etudiant3eme(int idantifiant, String nom, String prenom, float moyenne, String branche) {
		super(idantifiant,nom,prenom,moyenne);
		
		this.branche = branche;
	}



	public void setBranche(String branche) {
		this.branche = branche;
	}




	@Override
	public void ajouterUneAbsence() {

		 
		
		this.setMoyenne( (float) (this.getMoyenne()  -  0.5)  );
		
	}

}
