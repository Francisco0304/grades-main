package GUI;

import javax.swing.*;
import java.awt.*;

public class FondoWindow extends JInternalFrame {

    private MainWindow myWindow;
    private JDesktopPane desktopPane;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public FondoWindow(MainWindow mainWindow, JDesktopPane desktopPane){
        this.myWindow = mainWindow;
        this.desktopPane = desktopPane;
        setSize( new Dimension(382,537));
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setClosable(true);
        setLayout(new BorderLayout());
        desktopPane.add(this);
        setBorder(null);
        ocultarBarraTitulo();
        begin();

    }

    public void begin(){
        addComponenet();
        beginCompanente();
    }

    private void addComponenet() {

        add(new JLabel(new ImageIcon("icons/fondo.jpg")),BorderLayout.CENTER);
    }

    private void beginCompanente() {
    }

    public void ocultarBarraTitulo()
    {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
}
