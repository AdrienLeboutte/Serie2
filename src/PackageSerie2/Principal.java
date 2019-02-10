package PackageSerie2;

import javax.swing.*;

public class Principal {

    public static void main(String[] args)
    {

        String nom, prenom, genre, jour, mois, annee, chaine;
        int jourN,moisN, annN ,continuer;
        char sexe;

        int nbActiviteMAX = Etudiant.getNbMaxActivite();


            try {


                Professeur prof1 = new Professeur("Pirotte","Cécile",'f',25,02,1994);
                Professeur prof2 = new Professeur("Dubisy","Christine",'f',29,06,1965);
                Professeur prof3 = new Professeur("Van Kerm","Bernard",'m',2,11,1972);


                ActiviteApprentissage activite = new ActiviteApprentissage("java",prof1);
                ActiviteApprentissage activite2 = new ActiviteApprentissage("Base de données",prof2);
                ActiviteApprentissage activite3 = new ActiviteApprentissage("OS",prof3);


                Personne personne = new Personne("leboutte", "adrien", 'm', 25, 02, 1994);
                Etudiant etudiant = new Etudiant(personne, "droit", 3);

                /*
            do {

                nom = JOptionPane.showInputDialog(null, "Introduisez votre nom", "Nom", JOptionPane.DEFAULT_OPTION);
                prenom = JOptionPane.showInputDialog(null, "Introduisez votre prenom", "Prenom", JOptionPane.DEFAULT_OPTION);
                genre = JOptionPane.showInputDialog(null, "Introduisez votre genre", "Genre", JOptionPane.DEFAULT_OPTION);
                jour = JOptionPane.showInputDialog(null, "Introduisez votre jour de naissance", "Jour de naissance", JOptionPane.DEFAULT_OPTION);
                mois = JOptionPane.showInputDialog(null, "Introduisez votre mois de naissance", "Jour de naissance", JOptionPane.DEFAULT_OPTION);
                annee = JOptionPane.showInputDialog(null, "Introduisez votre annee de naissance", "Jour de naissance", JOptionPane.DEFAULT_OPTION);

                jourN = Integer.parseInt(jour);
                moisN = Integer.parseInt(mois);
                annN = Integer.parseInt(annee);

                sexe = genre.charAt(0);


                Personne personne = new Personne(nom, prenom, sexe, jourN, moisN, annN);
                Etudiant etudiant = new Etudiant(personne, "droit", 3);

                etudiant.ajouterActiviteApprentissage(activite);
                etudiant.ajouterActiviteApprentissage(activite2);
                etudiant.ajouterActiviteApprentissage(activite3);

                for(int indice = 0; indice < 3; indice++) {
                   System.out.println( etudiant.getActiviteApprentissage(indice));


                    System.out.println(etudiant.getActiviteApprentissage(indice).getProfesseur());
                }


                JOptionPane.showMessageDialog(null, etudiant, "Confirmation de l'inscription", JOptionPane.INFORMATION_MESSAGE);

                System.out.println(etudiant);

                continuer = JOptionPane.showConfirmDialog(null, "Continuer");
            } while (continuer == 0);

*/
                System.out.println( etudiant.getActiviteApprentissage(-3));

            JOptionPane.showMessageDialog(null,Personne.getNbFilles()  , "Nombre de fille", JOptionPane.INFORMATION_MESSAGE);

        }
        catch (SexeException exceptionSexe)
        {
            JOptionPane.showMessageDialog(null, exceptionSexe.getMessage(), "Sexe erronée", JOptionPane.ERROR_MESSAGE);
        }

        catch (SectionException exceptionSection)
        {
            JOptionPane.showMessageDialog(null, exceptionSection.getMessage(), "Section erronée", JOptionPane.ERROR_MESSAGE);
        }

        catch (AnneeException exceptionAnnee)
        {
            JOptionPane.showMessageDialog(null, exceptionAnnee.getMessage(), "Année erronée", JOptionPane.ERROR_MESSAGE);
        }
            /*
            catch (TropDActivites exceptionActivite)
            {
                JOptionPane.showMessageDialog(null, exceptionActivite.getMessage(), "Trop d'ajout", JOptionPane.ERROR_MESSAGE);
            }
*/
            catch (MauvaisNumeroDActivite exceptionMauvais)
            {
                JOptionPane.showMessageDialog(null, exceptionMauvais.getMessage(), "Position incorrecte", JOptionPane.ERROR_MESSAGE);
            }
        System.exit(0); // a utilisée si on utilise un composant swing(librairie) comme JOptionPane

    }
}
