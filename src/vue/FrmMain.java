package vue;

import dao.BikeDao;
import domaine.bike.Bike;
import domaine.price.PriceCalculator;
import domaine.store.*;
import factories.Company;

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
        setType(Type.UTILITY);
        setContentPane(panel);
        setTitle("Catalogue vélo");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        grpMagasin.add(rbBikeImportGeneve);
        grpMagasin.add(rbBikeShopGeneve);
        grpMagasin.add(rbBikeShopAnnemasse);

        btnCatalogue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Store store = null;
                PriceCalculator pc = null;
                List<Bike> velos = BikeDao.getBikeList();

                switch (grpMagasin.getSelection().getActionCommand()) {
                    case "BikeImportGeneve":
                        pc = Company.createPriceCalculator(Location.SWITZERLAND, StoreType.WHOLESALER);
                        store = Company.createStore(ProductType.BIKE,"BikeImportGeneve", velos, pc);
                        break;

                    case "BikeShopGeneve":
                        pc = Company.createPriceCalculator(Location.SWITZERLAND, StoreType.RESELLER);
                        store = Company.createStore(ProductType.BIKE,"BikeShopGeneve", velos, pc);
                        break;

                    case "BikeShopAnnemasse":
                        pc = Company.createPriceCalculator(Location.FRANCE, StoreType.WHOLESALER);
                        store = Company.createStore(ProductType.BIKE,"BikeShopAnnemasse", velos, pc);
                        break;
                }
                System.out.println(store.displayCatalogWithPriceList());
            }
        });
    }
}