package PackageSerie2;

public class MauvaisNumeroDActivite extends  Exception{

    private int mauvaisNumero;
    private int nombreReelActiviteApprentissage;


    public MauvaisNumeroDActivite(int mauvaisNumero, int nombreReelActiviteApprentissage)
    {
        this.mauvaisNumero = mauvaisNumero;
        this.nombreReelActiviteApprentissage = nombreReelActiviteApprentissage;
    }


    public String getMessage()
    {
        String chaine;

        if(mauvaisNumero < 0)
        {
            chaine = "Le numero "+ mauvaisNumero+" est inférieur ou égal a 0";
        }
        else
        {
            chaine = "le numéro proposé ne correspond pas à une activité d’apprentissage\n" +
                    "suivie par l’étudiant : "+ nombreReelActiviteApprentissage+" ";
        }

        return chaine;
    }

}
