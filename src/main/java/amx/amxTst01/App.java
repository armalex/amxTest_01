package amx.amxTst01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	CONCategorieUsageBienEnum conCategorieUsageBienEnum = CONCategorieUsageBienEnum.PAS_DAB;
    	String name = conCategorieUsageBienEnum.name();
    	System.out.println("Categorie : " + conCategorieUsageBienEnum + " [" + conCategorieUsageBienEnum.name() + "]") ;
    	System.out.println("Categorie : " + conCategorieUsageBienEnum + " [" + conCategorieUsageBienEnum.getLibelle() + "]") ;
    	System.out.println("Categorie : " + conCategorieUsageBienEnum + " [" + conCategorieUsageBienEnum.getCodeREGIS() + "]") ;
     	System.out.println( "END TEST" );
    }
}
