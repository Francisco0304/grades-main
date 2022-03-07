package Model;

import logic.Student;

import java.util.ArrayList;

public class Controller {

    private HandlingRegister registerStudent;


    public Controller() {
        registerStudent = new HandlingRegister();
    }

    public boolean addStudent(String ... data){
        if (registerStudent.findStudent(data[0])== null){
        String nameStudent = data[0];
        String codeStudent = data[1];

        Student student=new Student(nameStudent, codeStudent);
        registerStudent.addStudent(student);

        return true;

        }

        return false;
    }

/*
    public String[] findStudent(String codeS){

        Student student= register.findStudent(codeS);
        if (student!= null){
            String code=
        }
    }*/

    /*
    public String getStudent(){
        ArrayList<Student> students= this.registerStudent.getStudents();
        if (students.size()>0){
        String [][] out= new String[students.size()][5];
        int cont= 0;
        for (Student student: students){
            String nameS= students.toString();

        }
            return out;
        }
        return null;

    }

*/



}
