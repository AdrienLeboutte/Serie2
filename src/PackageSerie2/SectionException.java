package PackageSerie2;

public class SectionException extends Exception {

    private String sectionErrone;


    public SectionException(String sectionErrone)
    {
        this.sectionErrone = sectionErrone;
    }

    public String getMessage()
    {
        return "La valeur "+ sectionErrone+" est incorrrecte";
    }
}
