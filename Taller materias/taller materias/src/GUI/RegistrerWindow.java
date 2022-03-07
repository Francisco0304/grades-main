package GUI;

import logic.ManagementGrades;

import javax.swing.*;
import java.awt.*;

public class RegistrerWindow extends JInternalFrame {

    private MainWindow myWindow;
    private JDesktopPane desktopPane;

    //private JDesktopPane desktopPane;
    // private Registro registro;
    private JTextField std;
    private JTextField codeS;
    private JTextField codeM;
    private JTextField descrip;
    private JButton registrarS;
    private JButton registrarM;
    private JTextField credits;
    private JLabel tituloV;
    private JLabel linea;
    private JSeparator separator;
    private JSeparator separator2;
    private MainWindow mainWindow;
    private ManagementGrades managementGrades;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public RegistrerWindow(MainWindow mainWindow, JDesktopPane desktopPane){
        this.myWindow = mainWindow;
        this.desktopPane = desktopPane;
        setSize( new Dimension(382,537));
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setClosable(true);
        setLayout(new GridBagLayout());
        desktopPane.add(this);
        setBorder(null);
        ocultarBarraTitulo();
        begin();

    }

    private void begin() {
        beginComponent();
        addComponent();
    }

    private void beginComponent() {

        std= new JTextField();
        codeS= new JTextField();
        descrip= new JTextField();
        codeM= new JTextField();
        credits= new JTextField();
        tituloV =  new JLabel();
        linea = new JLabel();
        separator= new JSeparator();
        separator2= new JSeparator();

        registrarS= new JButton("Registrar Estudiante");
        // registrarS.setActionCommand(HandlingEvents.REG_);
        //registrarS.addActionListener(new HandlingEvents(mainWindow));


        registrarM= new JButton("Registrar Materia");

    }

    private void addComponent() {

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0;
        gbc.gridy= 0;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.insets= new Insets(5, 100, 5, 100);
        gbc.anchor = GridBagConstraints.CENTER;
        tituloV.setText("Ventana de Registro");
        tituloV.setFont(new Font("Times-Roman", Font.BOLD + Font.ITALIC, 16));
        add(tituloV,gbc);

        gbc.gridx=0;
        gbc.gridy= 1;
        separator2.setBackground(Color.BLACK);
        add(separator2, gbc);

        gbc.gridx=0;
        gbc.gridy= 2;

        add(new JLabel("Registro Estudiantes"), gbc);

        gbc.gridx=0;
        gbc.gridy= 3;
        gbc.fill= GridBagConstraints.CENTER;
        add(new JLabel("Nombre del Estudiante"), gbc);


        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( std, gbc );

        gbc.gridx=0;
        gbc.gridy= 5;
        gbc.fill= GridBagConstraints.CENTER;
        add(new JLabel("Codigo del Estudiante"), gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( codeS, gbc );

        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth=2;
        add( registrarS, gbc );

        gbc.gridx=0;
        gbc.gridy= 8;
        separator.setBackground(Color.BLACK);
        add(separator, gbc);


        gbc.gridx=0;
        gbc.gridy= 9;

        add(new JLabel("Registro Materias"), gbc);

        gbc.gridx=0;
        gbc.gridy=10;
        gbc.fill= GridBagConstraints.CENTER;
        gbc.insets= new Insets(5, 100, 5, 100);
        add(new JLabel("Nombre de la Materia"), gbc);


        gbc.gridy = 11;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( descrip, gbc );

        gbc.gridx=0;
        gbc.gridy=12;
        gbc.fill= GridBagConstraints.CENTER;
        add(new JLabel("Codigo de la Materia"), gbc);

        gbc.gridy = 13;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( codeM, gbc );


        gbc.gridy=14;
        gbc.gridx=0;
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx= 1.0;
        add(new JLabel("Creditos de la Materia"), gbc);
        // gbc.weightx=0.0;

        gbc.gridy = 15;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( credits, gbc );



        gbc.gridy = 16;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth=2;
        add( registrarM, gbc );

    }


    public String getNameStudent(){
        return std.getText();
    }

    public String getCodeStudent(){
        return codeS.getText();
    }

    public String getDescription(){
        return descrip.getText();
    }

    public String getCodeM(){
        return codeM.getText();
    }

    public String getCredits(){
        return credits.getText();
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
