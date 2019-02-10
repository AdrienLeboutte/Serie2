package PackageSerie2;

import oracle.jrockit.jfr.StringConstantPool;

public class Etudiant {

    private static int  NB_MAX_ACTIVITE = 5;

    private Personne personne;
    private String section;
    private int annee;

    private ActiviteApprentissage[] activite;


    public Etudiant(Personne personne, String section, int annee)throws AnneeException, SectionException {
        this.personne = personne;
        setSection(section);
        setAnnee(annee);
        activite = new  ActiviteApprentissage[NB_MAX_ACTIVITE];
    }


    public void setAnnee(int anneeEtude) throws AnneeException {
        if(anneeEtude < 1 && anneeEtude > 3)
        {
            throw new AnneeException(anneeEtude);
        }
        else
        {
            this.annee = anneeEtude;
        }
    }

    public void setSection(String section) throws SectionException {

        if(section != "droit" && section !="compta" && section != "market" && section != "infoGestion" && section != " technoInfo" )
        {
            throw  new SectionException(section);
        }
        else
        {
            this.section = section;
        }
    }

    public void ajouterActiviteApprentissage(ActiviteApprentissage activiteApprenti)throws TropDActivites
    {
        int indice = 0;

        while(indice < Integer.MAX_VALUE && activite[indice] != null)
        {
           indice++;
        }

        if(NB_MAX_ACTIVITE < indice)
        {
            throw new TropDActivites();
        }
        activite[indice] = activiteApprenti;
    }


    public ActiviteApprentissage  getActiviteApprentissage(int position)throws MauvaisNumeroDActivite
    {

       if(position < 0 ) throw new MauvaisNumeroDActivite(position,position);

       if(position > (NB_MAX_ACTIVITE - 1)) throw new MauvaisNumeroDActivite(position,position);


       return activite[position];
    }







    public String toString()
    {
        String chaine;

        chaine =  personne + "est ";

        if((personne.getSexe() == 'f') || (personne.getSexe() == 'F'))
        {
            chaine += " inscrite ";
        }
        else
        {
            chaine += "inscrit ";
        }

        chaine += "en "+ annee+" "+ section;

        chaine += "\nSon login name est "+ nomUtilisateurç();

        return chaine;

    }

    public String nomUtilisateurç()
    {
        String chaine;

       chaine = section.substring(0,2);
       chaine += annee;
       chaine += personne.getNom();
       chaine += personne.getPrenom().substring(0,1);

       return chaine;
    }

    public static int getNbMaxActivite() {
        return NB_MAX_ACTIVITE;
    }
}
