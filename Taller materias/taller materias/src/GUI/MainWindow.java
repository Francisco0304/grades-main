package GUI;

import Model.Controller;
import logic.ManagementGrades;
import logic.Matter;
import logic.Student;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private MainMenu menu;
    private JDesktopPane desktopPane;
    private RegistrerWindow registrer;
    private InscriptionWindow inscription;
    private ConsulterWindow consulter;
    private Controller controller;
    private ManagementGrades managementGrades;

    public MainWindow (String title){
        super(title);
        setMinimumSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
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
        controller= new Controller();
        managementGrades= new ManagementGrades();


    }

    public RegistrerWindow getRegistrer(){

        return registrer;
    }

    public void addRegisterStudent(){
        Object[] data= getDataStudent();
        if (controller.addStudent((String) data[0], (String) data[1])){
            JOptionPane.showMessageDialog(null,"Se registro el estudiante","Hecho",JOptionPane.INFORMATION_MESSAGE);
            managementGrades.addStudent(new Student(  registrer.getCodeStudent(), registrer.getNameStudent()));
            //imprint();

        }else {
            JOptionPane.showMessageDialog(null,"El estudiante ya se encuentra registrado","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addRegisterMatter(){
        Object[] data= getDataMatter();
        if (controller.addMatter((String) data[0], (String) data[1], String.valueOf((byte) data[2]))){
            JOptionPane.showMessageDialog(null,"Se registro la materia","Hecho",JOptionPane.INFORMATION_MESSAGE);
            managementGrades.addMatter(new Matter(registrer.getCodeM(), registrer.getDescription(),registrer.getCredits()));

            imprint();
        }else{
            JOptionPane.showMessageDialog(null,"La materia ya se encuentra registrada","Error",JOptionPane.ERROR_MESSAGE);
        }
    }



    private Object[] getDataStudent(){
        String nameStudent= registrer.getNameStudent();
        String codeStudent= registrer.getCodeStudent();


        Object[] out={nameStudent, codeStudent};

        return out;
    }

    private Object[] getDataMatter(){
        String description= registrer.getDescription();
        String codeMatter= registrer.getCodeM();
        Byte credits= registrer.getCredits();


        Object[] out={description, codeMatter, credits};

        return out;
    }


    public void imprint(){

        for (int i= 0; i<managementGrades.getMatters().size(); i++){
            System.out.println(managementGrades.getMatters().get(i).getDescription());
        }


    }

    public void print(){
        System.out.println(registrer.getNameStudent());
        System.out.println(registrer.getCodeStudent());
    }

    public InscriptionWindow getInscription(){
        return inscription;
    }
    public ConsulterWindow getConsulter(){
        return consulter;
    }


}



