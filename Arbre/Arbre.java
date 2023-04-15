package arbre;

import arbre.Noeud;

public class Arbre {
    public double[] trieAcs(double[] table){
        for (int j = 0; j < table.length; j++) {
            for (int i = j + 1; i < table.length; i++) {
                if(table[i] < table[j]){
                    double temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
        return table;
    }
    public Noeud centre(double[] table){
        double valeur = table[(int) table.length/2];
        double gauche = table[(int) table.length/4];
        int index = (int) table.length/2 + (int) table.length/4 + 1;
        double droite = table[index];
        return new Noeud(valeur, gauche, droite);
    }
}