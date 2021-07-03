
package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public interface SortSucelje {
    public String getIme();
    
    public long Odgoda();
    
    public void postaviOdgodu(long odgoda);
    
    public void pokreniSortiranje(PoljeSort polje);
    
}
