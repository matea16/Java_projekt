/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import java.util.ArrayList;
import javax.swing.JCheckBox;
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
    
    
    //pri otvaranju svi checkboxes moraju biti odznaceni
    @Override
    public void otvori() {
        checkboxes.forEach((box) -> {
            box.unselect();
            
        });

    }
    //doraditi konstruktor
    private class IzborAlgoritama{
        private final JCheckBox box;
        
        public IzborAlgoritama(JCheckBox box) {
            this.box = box;
        }
        
        public void unselect() {
            box.setSelected(false);
        }
     
        
        public boolean isSelected() {
            return box.isSelected();
        }
    }
    
}
