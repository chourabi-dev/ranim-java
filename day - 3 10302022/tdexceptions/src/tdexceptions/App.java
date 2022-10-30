package tdexceptions;

public class App {

	public static void main(String[] args) throws NoZeroException {

		
		// EVITER PROGRAM :'( CRACHES 

		int  q = 0;
		int  v = 10;
		
		
		try {
			
			
			if( q == 0 ) {
				throw new NoZeroException("Oups no zero here !!!!!!");
			}else {
				System.out.println( v / q );
			}
			
		}catch( NoZeroException e ) {
			System.out.println( e.getMessage() );
		}
		
		
		System.out.print("TADA !!!");
		

	}

}
