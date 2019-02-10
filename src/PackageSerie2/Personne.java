package PackageSerie2;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Personne {


    private static int nbFilles ;


    private String nom;
    private String prenom;

    private char sexe;

    private GregorianCalendar dateNaissance;




    public Personne(String nom, String prenom, char genre, int jour, int mois, int annee) throws SexeException {
        this.nom = nom;
        this.prenom = prenom;
        setSexe(genre);
        this.dateNaissance = new GregorianCalendar(annee, mois-1, jour);

        if ((genre == 'f' )|| (genre == 'F'))
        {
            nbFilles+=1;
        }
    }


    public void setSexe(char genre) throws  SexeException
    {
        if((genre != 'f' )&& (genre != 'F') && (genre !='M') && (genre !='m'))
        {
            throw  new SexeException(genre);
        }
        else
            {
            sexe = genre;
        }
    }


    public static int getNbFilles() {
        return nbFilles;
    }

    public char getSexe() {
        return sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public int age ()
    {
        int ageMoment, jour;

        GregorianCalendar dateJour = new GregorianCalendar();

        ageMoment = dateJour.get(Calendar.YEAR) - dateNaissance.get(Calendar.YEAR);

        jour = dateJour.get(Calendar.DAY_OF_MONTH) - dateNaissance.get(Calendar.DAY_OF_MONTH);


        if((dateJour.get(Calendar.MONTH)<= dateNaissance.get(Calendar.MONTH)) && jour < 0)
        {

                ageMoment--;

        }

        return ageMoment;
    }




    public String toString()
    {
        return prenom +" "+ nom+" ( "+age()+" ans) ";
    }




}
