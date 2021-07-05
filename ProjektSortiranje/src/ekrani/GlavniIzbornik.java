/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import algoritmisortiranja.SortSucelje;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
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
    
    //dodat cemo funkciju za dodavanje checkboxa posto ce ih biti vise, za svaki sort jedan
    private void dodajCheckbox(SortSucelje algoritam, JPanel panel)
    {
        JCheckBox box = new JCheckBox("", true);
        //postavljanje vrijednost
        box.setBackground(Color.DARK_GRAY);
        box.setForeground(Color.WHITE);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        //dodavanje novog moguceg izbora
        checkboxes.add(new IzborAlgoritama(algoritam, box));
        //dodavanje na panel
        panel.add(box);
        
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
        //o kojem se algoritmu radi
        private final SortSucelje algoritam;
        
        public IzborAlgoritama(SortSucelje algoritam, JCheckBox box) {
            this.box = box;
            this.algoritam = algoritam;
            this.box.setText(algoritam.getIme());
        }
        
        public void unselect() {
            box.setSelected(false);
        }
     
        
        public boolean isSelected() {
            return box.isSelected();
        }
        
        public SortSucelje algoritam(){
            return algoritam;
        }
    }
    
}
