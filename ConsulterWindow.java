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

    public ConsulterWindow(MainWindow mainWindow, JDesktopPane desktopPane){
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
        beginComponents();
        addComponent();
    }

    private void addComponent() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx =0;
        gbc.gridy =0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty =1.0;
        add(new JLabel("--1--"),gbc);


        gbc.gridy =1;
        gbc.gridheight =2;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JLabel(" --2--"),gbc);


        gbc.gridx =4;
        gbc.gridy =1;
        add(new JLabel("--3--"),gbc);

        gbc.gridx =1;
        gbc.gridy =1;
        add(new JLabel("Seleccione la opcion"),gbc);

        gbc.gridx= 2;
        gbc.gridy =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(typeSearch,gbc);
        gbc.weightx = 0.0;

        gbc.gridx =1;
        gbc.gridy =3;
        gbc.weightx = 1.0;
        add(new JLabel("Digite el Codigo"),gbc);
        gbc.weightx = 0.0;


        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(codeField,gbc);
        gbc.weightx = 0.0;



    }

    private void beginComponents() {

        btnclean = new JButton();
        btnsearch = new JButton();
        codeField = new JTextField();

        Object[] titles = {"Numero","Cliente","Forma Pago","Fecha","Valor"};
        dmt = new DefaultTableModel( titles,1 );
        students = new JTable();

        String options[] = {"Credito","Efectivo"};
        typeSearch = new JComboBox<>( options );

    }

    public void cleanFields(){

    }

}
