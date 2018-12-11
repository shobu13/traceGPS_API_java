package jim.testsvisuels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

    public static void main(String[] args) throws ParseException {

        String msg;

        // test visuel de la méthode getTousLesUtilisateurs


        //<editor-fold desc="test getLesUtilisateursQueJautorise">
        /*// test visuel de la méthode getLesUtilisateursQueJautorise
        ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
        msg = PasserelleServicesWebXML.getLesUtilisateursQueJautorise("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
        // affichage de la réponse
        System.out.println(msg);
        // affichage du nombre d'utilisateurs
        System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
        // affichage de tous les utilisateurs
        for (Utilisateur unUtilisateur : lesUtilisateurs) {
            System.out.println(unUtilisateur.toString());
        }*/
        //</editor-fold>


        //<editor-fold desc="test getLesUtilisateursQuiMautorisent">
        //// test visuel de la méthode getLesUtilisateursQuiMautorisent
        //ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
        //msg = PasserelleServicesWebXML.getLesUtilisateursQuiMautorisent("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
        //// affichage de la réponse
        //System.out.println(msg);
        //// affichage du nombre d'utilisateurs
        //System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
        //// affichage de tous les utilisateurs
        //for (Utilisateur unUtilisateur : lesUtilisateurs)
        //{	System.out.println(unUtilisateur.toString());
        //}
        //</editor-fold>


        // test visuel de la méthode getLesParcoursDunUtilisateur


        // test visuel de la méthode getUnParcoursEtSesPoints

        //<editor-fold desc="test getUnParcoursEtSesPoints">
        // test visuel de la méthode getUnParcoursEtSesPoints
        Trace laTrace = new Trace();
        msg = PasserelleServicesWebXML.getUnParcoursEtSesPoints("europa", Outils.sha1("mdputilisateur"), 2, laTrace);
        // affichage de la réponse
        System.out.println(msg);
        // affichage de la trace
        System.out.println(laTrace.toString());
        //</editor-fold>


    } // fin Main
} // fin class
