
package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class BubbleSort implements SortSucelje {
    private long korakOdgode = 2;
    
    @Override public void pokreniSortiranje(PoljeSort polje){
       int len = polje.velicinaPolja();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (polje.vrijednost(j) > polje.vrijednost(j + 1)) {
                    polje.swap(j, j + 1, odgoda(), true);
                }
            }
        }
    }
            
    @Override public String getIme(){
        return "Bubble Sort";
    }
                    
    @Override public long odgoda(){
        return korakOdgode;
    }
                            
    @Override public void postaviOdgodu(long odgoda){
        this.korakOdgode = odgoda;
    }
                            
}
