package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ConsulterWindow extends JInternalFrame {

    private JButton btnsearch;
    private JButton btnclean;
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
        setBackground(Color.WHITE);
        desktopPane.add(this);
        ocultarBarraTitulo();
        begin();

    }

    private void begin() {
        beginComponents();
        addComponent();
    }

    private void addComponent() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=1;
        gbc.weightx=1.0;
        gbc.weighty =1.0;
        gbc.insets = new Insets(5,100,5,100);
        add(new JLabel("Seleccione"),gbc);
        gbc.weightx=0.0;
        gbc.weighty =0.0;

        gbc.gridx =0;
        gbc.gridy =1;
        gbc.gridwidth=1;
        gbc.weightx=1.0;
        gbc.weighty =1.0;
        add(new JLabel("Digite el Codigo"),gbc);
        gbc.weightx=0.0;
        gbc.weighty =0.0;

        gbc.gridx = 1;
        gbc.gridy =0;
        gbc.gridwidth=1;
        gbc.weightx =1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(typeSearch,gbc);
        gbc.weightx =0.0;

        gbc.gridx =1;
        gbc.gridy=1;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        add(codeField,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.gridheight=2;
        gbc.fill= GridBagConstraints.BOTH;
        add(new JScrollPane(students),gbc);
        gbc.gridwidth=0;
        gbc.gridheight=0;
        gbc.fill= GridBagConstraints.NONE;

        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth =1;
        gbc.insets = new Insets(0,0,20,0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btnsearch,gbc);

        gbc.gridx=1;
        gbc.gridy=4;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        add(btnclean,gbc);

    }

    private void beginComponents() {

        btnclean = new JButton("Limpiar Campos");
        btnsearch = new JButton("Buscar");
        codeField = new JTextField();

        Object[] titles = {"Numero","Cliente","Forma Pago","Fecha","Valor"};
        dmt = new DefaultTableModel( titles,1 );
        students = new JTable();

        String options[] = {"Buscar por Materia","Buscar por Estudiante"};
        typeSearch = new JComboBox<>( options );

    }

    public void cleanFields(){

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
