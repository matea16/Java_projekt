package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class SelectionSort implements SortSucelje{
    private long korakOdgode = 120;
   
    @Override public void pokreniSortiranje(PoljeSort polje) {
        int d = polje.velicinaPolja();
        for (int i = 0; i < d - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < d; j++) {
                if (polje.vrijednost(j) < polje.vrijednost(minIndex)) {
                    minIndex = j;
                }
            }
            polje.swap(i, minIndex, odgoda(), true);
        }
    }

    @Override public String getIme() {
        return "Selection Sort";
    }

    @Override public long odgoda() {
        return korakOdgode;
    }

    @Override public void postaviOdgodu(long odgoda) {
        this.korakOdgode = odgoda;
    }
}
