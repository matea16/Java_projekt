
package projektsortiranje;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class PoljeSort extends JPanel{
    public static final int DEFAULT_PROZOR_SIRINA = 1280;
    public static final int DEFAULT_PROZOR_VISINA = 720;
    private static final int DEFAULT_BAR_SIRINA = 5;
   
    private static final double BAR_VISINA_POSTOTAK = 512.0/720.0;
    private static final int BROJ_BAROVA = DEFAULT_PROZOR_SIRINA / DEFAULT_BAR_SIRINA;
    
    private final int[] polje;
    private final int[] barBoja;
    private String imeAlgoritma = "";
  
    private long delay = 0;
    

    private int promjenePolja = 0; 

    public PoljeSort() {
        setBackground(Color.DARK_GRAY);
        polje = new int[BROJ_BAROVA];
        barBoja = new int[BROJ_BAROVA];
        for (int i = 0; i < BROJ_BAROVA; i++) {
            polje[i] = i;
            barBoja[i] = 0;
        }

    }
    
    public void swap(int i, int j, long odgoda, boolean zastavica){
        
    }
    
    public int velicinaPolja() {
        return polje.length;
    }
    
    public int vrijednost(int index) {
        return polje[index];
    }
}
