package ExoSRP;

import java.util.ArrayList;

class Jeu {
	private ArrayList<Joueur> lesJoueurs;
	private De de;

	public Jeu() {
		this.lesJoueurs = new ArrayList<Joueur>();
		this.de = new De();
	}

	public ArrayList<Joueur> getListJoueurs(){
		return this.lesJoueurs;
	}

	public void ajouterJoueur(Joueur joueur) {
		lesJoueurs.add(joueur);
	}

	public int jouerUnTour() {
		int total = 0;
		for (int i = 0; i < 2; i++) {
			de.lancerDe();
			total += de.getValeur();
		}
		return total;
	}

	public String bataille() {
		int nbGagnants = 0, score, max = 0;
		String nomsGagnants = "";
		String res;
		
		for (Joueur joueur : lesJoueurs) {
			score = jouerUnTour();
			if (score > max) {
				max = score;
				nbGagnants = 1;
				nomsGagnants = joueur.getNom();
			} else if (score == max) {
				nbGagnants += 1;
				nomsGagnants += "-" + joueur.getNom();
			}
			System.out.println(joueur.getNom() + " : " + score);
		}
		if (nbGagnants == 1)
			res = "Le gagnant est ";
		else
			res = "Il y a " + nbGagnants + " exaequo :";
		res += nomsGagnants;
		return res;
		}

}
