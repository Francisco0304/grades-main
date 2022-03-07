package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class pruevas extends JFrame {

    private JButton btnsearch;
    private JButton btnclean;
    private JTable students;
    private JTextField codeField;
    private DefaultTableModel dmt;
    private JComboBox<String> typeSearch;
    private MainWindow myWindow;
    private JDesktopPane desktopPane;


    public pruevas (){

        setSize( new Dimension(782,537));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setBackground(Color.lightGray);
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
        add(new JLabel("Seleccione"),gbc);

        gbc.gridx = 1;
        gbc.gridy =0;
        add(typeSearch,gbc);

        gbc.gridx =0;
        gbc.gridy =1;
        add(new JLabel("Digite el Codigo"),gbc);

        gbc.gridx =1;
        gbc.gridy=1;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        add(codeField,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
       // gbc.gridwidth=2;
        add(new JScrollPane(students),gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        add(btnsearch,gbc);

        gbc.gridx=1;
        gbc.gridy=4;
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
}
