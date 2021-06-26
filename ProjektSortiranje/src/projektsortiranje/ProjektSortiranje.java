
package projektsortiranje;


import java.util.ArrayList;
import javax.swing.JFrame;



public class ProjektSortiranje {
    private final JFrame prozor;
    
    public static final int PROZOR_SIRINA = 1280;
    public static final int PROZOR_VISINA = 720;
    
    private final ArrayList<Ekran> ekrani; //mislim da valjda treba napraviti klasu ekran
    
    public ProjektSortiranje() {
        ekrani = new ArrayList<>();
        prozor = new JFrame ("Sortiranje");
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.setVisible(true);
    }
    
    

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            new ProjektSortiranje().start(); //
        });
    }
    
}
