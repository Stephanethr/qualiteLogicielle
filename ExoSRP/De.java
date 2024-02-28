package ExoSRP;

public class De {
    private int valeur;

    public De() {
        this.valeur = 0;
    }

    public int getValeur(){
        return this.valeur;
    }

    public void lancerDe() {
        this.valeur = (int) (6 * Math.random()) + 1;

    }


}
