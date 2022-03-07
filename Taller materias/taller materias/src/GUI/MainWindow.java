package GUI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private MainMenu menu;
    private JDesktopPane desktopPane;
    private RegistrerWindow registrer;
    private InscriptionWindow inscription;
    private ConsulterWindow consulter;

    public MainWindow (String title){
        super(title);
        setMinimumSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        begin();
    }

    private void begin(){
        beginComponents();
        addComponents();
    }

    private void addComponents(){

        add(desktopPane,BorderLayout.CENTER);
        this.setJMenuBar(menu);

    }
    private void beginComponents(){

        menu = new MainMenu(this);
        desktopPane = new JDesktopPane();
        registrer = new RegistrerWindow(this,desktopPane);
        inscription = new InscriptionWindow(this,desktopPane);
        consulter = new ConsulterWindow(this,desktopPane);

    }

    public RegistrerWindow getRegistrer(){
        return registrer;
    }
    public InscriptionWindow getInscription(){
        return inscription;
    }
    public ConsulterWindow getConsulter(){
        return consulter;
    }


}
