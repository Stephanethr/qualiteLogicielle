package ExoSRP;

public class Test {

	public static void main(String[] args) {
		Jeu j=new Jeu();
		De de = new De();
		j.ajouterJoueur("Pierre");
		j.ajouterJoueur("Marie");
		j.ajouterJoueur("Jean");
		j.bataille();
	}

}
