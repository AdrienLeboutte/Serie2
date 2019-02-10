package PackageSerie2;

public class ActiviteApprentissage {

    private String libelle;
    private Professeur professeur;


    public ActiviteApprentissage(String libelle, Professeur professeur) {
        this.libelle = libelle;
        this.professeur = professeur;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    @Override
    public String toString() {
        return "l' activité d'apprentissage intitulé "+libelle+ " donnée par "+professeur;
    }
}
