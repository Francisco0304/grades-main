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
        setMinimumSize(new Dimension(800, 600));
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
    Object[] data= getData();




        return registrer;
    }

    private Object[] getData(){
    String nameStudent= registrer.getNameStudent();
    String codeStudent= registrer.getCodeStudent();
    String desriptionMatter= registrer.getDescription();
    String codeMatter= registrer.getCodeM();
    String credits= registrer.getCredits();

    Object[] out={nameStudent, codeStudent, desriptionMatter, codeMatter, credits};

    return out;
    }




    public InscriptionWindow getInscription(){
        return inscription;
    }
    public ConsulterWindow getConsulter(){
        return consulter;
    }


}
