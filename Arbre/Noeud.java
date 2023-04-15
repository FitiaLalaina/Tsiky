package arbre;

public class Noeud {
    private double valeur, gauche, droite;

    public Noeud(double valeur, double gauche, double droite){
        this.setValeur(valeur);
        this.setDroite(droite);
        this.setGauche(gauche);
    }
    
    public double getGauche() {
        return gauche;
    }

    public void setGauche(double gauche) {
        this.gauche = gauche;
    }

    public double getDroite() {
        return droite;
    }

    public void setDroite(double droite) {
        this.droite = droite;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
    
    
}
