/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import java.util.ArrayList;
import projektsortiranje.ProjektSortiranje;

/**
 *
 * @author martinaradenic
 */
public class GlavniIzbornik extends Ekran{
    
    //izbori mogućih algoritama
    private ArrayList<IzborAlgoritama> checkboxes;
    //konstruktor
    public GlavniIzbornik(ProjektSortiranje apl)
    {
        super(apl);
        checkboxes = new ArrayList<>();
    }
    
    //dodati funkcije za selected i konstruktor nakon sta se kretiraju algoritmi
    private class IzborAlgoritama{
        
    }
    
}
