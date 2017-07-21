package amx.amxTst01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	AmxCategorie amxCategorie = AmxCategorie.BIENS_EXT;
    	//String name = amxCategorie.name();
    	System.out.println("Categorie : " + amxCategorie + " [" + amxCategorie.name() + "]") ;
    	
    	System.out.println("Categorie : " + amxCategorie + " [" + amxCategorie.getCodeAmx1() + "]") ;
    	System.out.println("Categorie : " + amxCategorie + " [" + amxCategorie.getCodeAmx2() + "]") ;
    	System.out.println("Categorie : " + amxCategorie + " [" + amxCategorie.getCodeAmx3() + "]") ;
    	
     	
     	System.out.println( "END TEST" );
    }
}
