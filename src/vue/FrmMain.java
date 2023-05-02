package vue;

import dao.BikeDao;
import domaine.bike.Bike;
import domaine.store.Store;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrmMain extends JFrame {
    private JPanel panel;
    private JButton btnCatalogue;
    private JRadioButton rbBikeImportGeneve;
    private JRadioButton rbBikeShopGeneve;
    private JRadioButton rbBikeShopAnnemasse;
    private ButtonGroup grpMagasin = new ButtonGroup();

    public FrmMain() {
        setType(Type.UTILITY); setContentPane(panel); setTitle("Catalogue vélo"); pack();
        setLocationRelativeTo(null); setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        grpMagasin.add(rbBikeImportGeneve); grpMagasin.add(rbBikeShopGeneve); grpMagasin.add(rbBikeShopAnnemasse);

        btnCatalogue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Store store = null;
                List<Bike> velos = BikeDao.getBikeList();

                /*"switch (grpMagasin.getSelection().getActionCommand()) {
                    case "BikeImportGeneve":
                        store = new Store(velos); break;

                    case "BikeShopGeneve":
                        store = new Store(velos);
                        break;
                    case "BikeShopAnnemasse":
                        store = new Store(velos);
                        break;
                }
                new Catalogue().afficherListePrix(magasin);*/
            }
        });
    }
}