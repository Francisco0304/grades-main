package Model;

import logic.Matter;
import logic.Student;

public class Controller {

    private HandlingRegister register;


    public Controller() {
        register = new HandlingRegister();
    }

    public boolean addStudent(String ... data){
        if (register.findStudent(data[0])== null){
            String nameStudent = data[0];
            String codeStudent = data[1];

            Student student=new Student(nameStudent, codeStudent);
            register.addStudent(student);

            // System.out.println();
            return true;

        }

        return false;
    }


    public boolean addMatter(String ... data){
        if (register.findMatter(data[0])== null){
            String descriptionMatter= data[1];
            String codeMatter= data[0];
            byte credits= Byte.parseByte(data[2]);

            Matter matter= new Matter(codeMatter, descriptionMatter, credits);
            register.addMatter(matter);

            return true;
        }

        return false;
    }


}