package GUI;

import logic.Matter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;

public class ConsulterWindow extends JInternalFrame{

    private JButton btnsearch;
    private JButton btnclean;
    private JLabel tituloV;
    private JLabel label1;
    private JLabel label2;
    private JTable students;
    private JTextField codeField;
    private DefaultTableModel dmt;
    private JComboBox<String> typeSearch;
    private MainWindow myWindow;
    private JDesktopPane desktopPane;


    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public ConsulterWindow(MainWindow mainWindow, JDesktopPane desktopPane){
        this.myWindow = mainWindow;
        this.desktopPane = desktopPane;
        setSize( new Dimension(382,537));
        setResizable(false);
        //setDefaultCloseOperation(HIDE_ON_CLOSE);
        //setClosable(true);
        setLayout(new GridBagLayout());
        setBackground(Color.LIGHT_GRAY);
        setBorder(null);
        desktopPane.add(this);
        ocultarBarraTitulo();
        begin();

    }

    private void begin() {
        beginComponents();
        addComponent();
    }

    private void addComponent()  {

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=2;
        gbc.insets = new Insets(25,10,5,10);
        gbc.anchor = GridBagConstraints.CENTER;
        tituloV.setText("Ventana de Consulta");
        tituloV.setFont(new Font("Times-Roman", Font.BOLD + Font.ITALIC, 16));
        add(tituloV,gbc);
        gbc.gridwidth=0;

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth=1;
        gbc.weightx=1.0;
        gbc.insets = new Insets(5,30,5,30);
        label1.setFont(new Font("Times-Roman", Font.ROMAN_BASELINE, 12));
        gbc.fill= GridBagConstraints.HORIZONTAL;
        add(label1,gbc);
        gbc.weightx=0.0;

        gbc.gridx =0;
        gbc.gridy =2;
        gbc.gridwidth=1;
        gbc.weightx=1.0;
        label2.setFont(new Font("Times-Roman", Font.ROMAN_BASELINE, 12));
        add(label2,gbc);
        gbc.weightx=0.0;

        gbc.gridx = 1;
        gbc.gridy =1;
        gbc.gridwidth=1;
        gbc.weightx =1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(typeSearch,gbc);
        gbc.weightx =0.0;

        gbc.gridx =1;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.weightx =1.0;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        add(codeField,gbc);
        gbc.weightx =0.0;

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=2;
        gbc.gridheight=2;
        gbc.weighty =1.0;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(5,30,5,30);
        gbc.fill= GridBagConstraints.BOTH;
        add(new JScrollPane(students),gbc);
        gbc.weighty =0.0;
        gbc.weightx = 0.0;

        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth =1;
        gbc.weightx =1.0;
        gbc.insets = new Insets(0,30,20,0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        btnsearch.setIcon(new ImageIcon("icons/lupa.png"));
        add(btnsearch,gbc);

        gbc.gridx=1;
        gbc.gridy=5;
     //   gbc.gridwidth =1;
        gbc.weightx =1.0;
        gbc.insets = new Insets(0,10,20,30);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        btnclean.setIcon(new ImageIcon("icons/basura.png"));
        add(btnclean,gbc);
        gbc.weightx =0.0;

    }

    private void beginComponents() {

        tituloV = new JLabel("VENTANA DE CONSULTA");
        label1 = new JLabel("Seleccione la opcion");
        label2 = new JLabel("Digite el Codigo");
        btnclean = new JButton("Limpiar Campos");
        btnclean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanFields();
            }
        });

        btnsearch = new JButton("    Buscar    ");
        btnsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (codeField.getText().length()>0 ){
                    JOptionPane.showMessageDialog(null, "xd2");
                    cleanFields();
                }else{
                    JOptionPane.showMessageDialog(null, "Campo Vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        codeField = new JTextField();
        codeField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && Character.isSpaceChar(e.getKeyChar())) {
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


        Object[] titles = {"Estudiante","Materia"};
        dmt = new DefaultTableModel( titles,5 );
        students = new JTable(dmt);
        students.setBackground(Color.WHITE);

        String options[] = {"Seleccione...","Buscar por Materia","Buscar por Estudiante"};
        typeSearch = new JComboBox<>( options );

    }

    public void cleanFields(){
        typeSearch.setSelectedItem(typeSearch.getItemAt(0)        );
        codeField.setText("");
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
