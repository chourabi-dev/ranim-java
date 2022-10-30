package tdrev;

public class App {
	
	public void changerEcole(Etudiant etd, Ecole e) {
		e.ajouterEtudiant( etd );
	}

	public static void main(String[] args) {
		
		
		/*
		 *  Etudiant e1 = new Etudiant(1,"Taher","chourabi",9);
			Etudiant e2 = new Etudiant(2,"Taher","chourabi",9); 
			System.out.println( e1.equals(e2) );
		 * */
		
		
		/*
		 * EtudiantAlternance ea = new EtudiantAlternance(1,"taher","chourabi", 9 , 1000);
		
		System.out.println( ea.getSalaire() );
		
		
		ea.ajouterUneAbsence();
		ea.ajouterUneAbsence();
		
		
		
		System.out.println( ea.getSalaire() );
		 * */
		
		EtudiantAlternance ea1 = new EtudiantAlternance(1,"taher","chourabi", 9 , 1000);
		EtudiantAlternance ea2 = new EtudiantAlternance(2,"Ranim","demo", 19 , 3500);
		Etudiant3eme e3 = new Etudiant3eme(3,"Test","User", 19 , "INFO");
		
				
		
		Ecole ecole =new Ecole( "ESPRIT" ); // 500 etudiants reservations RAM
		
		
		ecole.ajouterEtudiant(ea1);
		ecole.ajouterEtudiant(ea2);
		ecole.ajouterEtudiant(e3);
		
		
		/*
		 * System.out.println(ecole.count);
		
		System.out.println( ecole.getEtudiants()[0] );
		System.out.println( ecole.getEtudiants()[1] );
		System.out.println( ecole.getEtudiants()[2] );
		
		 * */
		
		
		//System.out.println(ecole.rechercherEtudiant( ea1  ));
		
		//System.out.println(ecole.getMoyenneDes3A(  ));
		System.out.print(ecole.toString());
		
				
		
		Ecole ecole2 =new Ecole( "ULT" ); // 500 etudiants reservations RAM
		
		
		
		// changerEcole( ecole.getEtudiants()[0] , ecole2 );
		
		

	}

}
