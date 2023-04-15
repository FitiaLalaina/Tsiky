package arbre;

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
    
}