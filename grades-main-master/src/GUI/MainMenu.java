package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar {

        private JMenu optionsMenu;
        private JMenuItem registrer;
        private JMenuItem inscription;
        private JMenuItem consuler;

        private MainWindow myWindow;

        public MainMenu (MainWindow mainWindow){
            this.myWindow = mainWindow;
            beginComponent();
            addComponent();
        }

       private void addComponent(){

            optionsMenu.add(registrer);
            optionsMenu.add(inscription);
            optionsMenu.add(consuler);
            add(optionsMenu);
    }

        private void beginComponent(){

            optionsMenu= new JMenu("Opciones");
            registrer = new JMenuItem("Registrar");
            inscription = new JMenuItem("Inscribir");
            consuler = new JMenuItem("Consultar");
           // registrer.addActionListener((event) -> myWindow.getRegistrer().setVisible( true ));
            //  inscription.addActionListener((event) -> myWindow.getInscription().setVisible( true ) );
            //consuler.addActionListener((event) -> myWindow.getConsulter().setVisible( true ) );
            registrer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myWindow.getRegistrer().setVisible( true );
                    myWindow.getInscription().setVisible( false);
                    myWindow.getConsulter().setVisible( false);
                }
            });

            inscription.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myWindow.getRegistrer().setVisible( false);
                    myWindow.getInscription().setVisible( true);
                    myWindow.getConsulter().setVisible( false);
                }
            });
            consuler.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myWindow.getRegistrer().setVisible( false );
                    myWindow.getInscription().setVisible( false) ;
                    myWindow.getConsulter().setVisible( true) ;
                }
            });


        }

}
