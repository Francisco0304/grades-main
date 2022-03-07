package GUI;

import javax.swing.*;
import java.awt.*;

public class InscriptionWindow extends JInternalFrame {

    private MainWindow myWindow;
    private JDesktopPane desktopPane;

    public InscriptionWindow(MainWindow mainWindow, JDesktopPane desktopPane){
        this.myWindow = mainWindow;
        this.desktopPane = desktopPane;
        setSize( new Dimension(782,537));
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setClosable(true);
        setLayout(new GridBagLayout());
        desktopPane.add(this);
        begin();

    }

    private void begin() {
        beginComponent();
        addComponent();
    }

    private void beginComponent() {
    }

    private void addComponent() {
        add(new JLabel("ventana de inscripcion"));
    }

}
