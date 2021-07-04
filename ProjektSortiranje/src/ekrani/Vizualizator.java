/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import algoritmisortiranja.SortSucelje;
import java.util.ArrayList;
import projektsortiranje.PoljeSort;
import projektsortiranje.ProjektSortiranje;

/**
 *
 * @author juricaradenic
 */
public class Vizualizator extends Ekran{
    private final PoljeSort polje;
    private final ArrayList<SortSucelje> kakoSortirati;
    
    public Vizualizator( ArrayList<SortSucelje> algoritmi, ProjektSortiranje apl){
        super(apl);
        polje = new PoljeSort();
        kakoSortirati = algoritmi;
        
    }
            

    @Override
    public void otvori() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
