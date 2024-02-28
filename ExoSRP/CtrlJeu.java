package ExoSRP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CtrlJeu {
    private Jeu jeu;

    public void lancerJeu(){
        this.jeu = new Jeu();
    }

    public String getResultat(){
        return jeu.bataille();
    }

    public ArrayList<Joueur> createJoueurs(int nbJoueurs){
        for (int i = 0; i < nbJoueurs; i++) {
            Joueur joueur = new Joueur("Joueur" + i);
            jeu.ajouterJoueur(joueur);
        }
        return jeu.getListJoueurs();
    }

    public ArrayList<Joueur> getListJoueurs(){
        return jeu.getListJoueurs();
    }

    public int getNbJoueurs(){
        return Array.getLength(jeu.getListJoueurs().toArray());
    }

    public void jouerUnTour(){
        jeu.jouerUnTour();
    }
}
