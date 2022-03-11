package GUI;

import logic.ManagementGrades;
import logic.Matter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class InscriptionWindow extends JInternalFrame implements KeyListener, ActionListener {

    private MainWindow myWindow;
    private JDesktopPane desktopPane;
    private Matter matter;
    private ManagementGrades managementGrades;

    private Label titulo = new Label();
    private JTextField inscript;
    private JTextField codeS;
    private JTextField codeM;
    private JButton registerM;
    private byte credits = 0;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public InscriptionWindow(MainWindow mainWindow, JDesktopPane desktopPane){
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

    private void addComponent() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0;
        gbc.gridy= 0;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        titulo.setText("Ventana Inscripcion");
        titulo.setFont(new Font("Times-Roman", Font.BOLD + Font.ITALIC, 16));
        add(titulo);

        gbc.insets= new Insets(5, 100, 5, 100);
        gbc.gridx=0;
        gbc.gridy= 3;
        gbc.fill= GridBagConstraints.CENTER;
        add(new JLabel("Codigo del Estudiante"), gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( codeS, gbc );

        gbc.gridx=0;
        gbc.gridy= 6;

        gbc.gridx=0;
        gbc.gridy=7;
        gbc.fill= GridBagConstraints.CENTER;
        gbc.insets= new Insets(5, 100, 5, 100);
        add(new JLabel("Nombre de la Materia"), gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( inscript, gbc );

        gbc.gridx=0;
        gbc.gridy=9;
        gbc.fill= GridBagConstraints.CENTER;
        add(new JLabel("Codigo de la Materia"), gbc);

        gbc.gridy = 10;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( codeM, gbc );

        gbc.gridy = 11;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth=2;
        add( registerM, gbc );

    }

    private void beginComponent() {
        codeS= new JTextField();
        codeS.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && !Character.isSpaceChar(e.getKeyChar())) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        inscript= new JTextField();
        inscript.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isAlphabetic(e.getKeyChar()) && !Character.isSpaceChar(e.getKeyChar())) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        codeM= new JTextField();
        codeM.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && !Character.isSpaceChar(e.getKeyChar())) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        registerM= new JButton("Inscribir Materia");
        registerM.addActionListener(this);
        // registerM.setActionCommand(HandlingEvents.REG_);


    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (  !Character.isAlphabetic(e.getKeyChar( ))){
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (codeM.getText().length() > 0 && inscript.getText().length() > 0 && codeS.getText().length() > 0 && codeM.getText().length() > 0) {
            JOptionPane.showMessageDialog(null, "xd2");
            cleanFields();
            matter = new Matter(inscript.getText(), codeM.getText(), credits);
            //if (managementGrades.addMatter(matter) ) {
            // JOptionPane.showMessageDialog(null, "xd");
            //}
        } else {
            JOptionPane.showMessageDialog(null, "Campo Vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ocultarBarraTitulo()
    {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }

    public void cleanFields(){
        inscript.setText("");
        codeM.setText("");
        codeS.setText("");
    }

}
