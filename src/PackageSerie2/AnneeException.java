package PackageSerie2;

public class AnneeException extends Exception {

   private int anneeEronne;

   public AnneeException( int anneeEronne)
   {
       this.anneeEronne = anneeEronne;
   }


   public String getMessage()
   {
       return "La valeur "+ anneeEronne+ " est errone !";
   }




}
