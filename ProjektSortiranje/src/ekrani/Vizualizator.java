/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import algoritmisortiranja.SortSucelje;
import java.awt.BorderLayout;
import java.util.ArrayList;
import projektsortiranje.PoljeSort;
import projektsortiranje.ProjektSortiranje;

/**
 *
 * @author martinaradenic
 */
public class Vizualizator extends Ekran{
    private final PoljeSort polje;
    private final ArrayList<SortSucelje> kakoSortirati;
    
    public Vizualizator( ArrayList<SortSucelje> algoritmi, ProjektSortiranje apl){
        super(apl);
        polje = new PoljeSort();
        kakoSortirati = algoritmi;
        //postavljanje layouta
        setLayout(new BorderLayout());
        add(polje, BorderLayout.CENTER);
        
    }
            

    @Override
    public void otvori() {
        //Swing worker koji spava, onda shuffle i pokrene sort
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
}
