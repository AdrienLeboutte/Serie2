package PackageSerie2;

public class SexeException  extends Exception {

    private char sexeErrone;

    public SexeException (char sexeErrone)
    {
        this.sexeErrone = sexeErrone;
    }


    public String getMessage()
    {
        return "La valeur "+ sexeErrone +" proposée pour le sexe est invalie !";
    }


}
