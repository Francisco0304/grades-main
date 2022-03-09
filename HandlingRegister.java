package Model;

import logic.Matter;
import logic.Student;

import java.util.ArrayList;
import java.util.Optional;

public class HandlingRegister {
    private ArrayList<Student> students;
    private ArrayList<Matter> matters;

    public HandlingRegister() {

        students= new ArrayList<>();
        matters= new ArrayList<>();
    }

    public void addStudent(Student student){
    students.add(student);
    }
    public void addMatter(Matter matter){
        matters.add(matter);
    }

    public Student findStudent(String codeS){
    Optional<Student> student= students.stream().filter(b -> b.getCode().equals(codeS)).findFirst();
    return student.isPresent() ? student.get() : null;
    }

    public Matter findMatter(String codeM){
        Optional<Matter> matter= matters.stream().filter(b-> b.getCode().equals(codeM)).findFirst();
        return matter.isPresent() ? matter.get() : null;
    }


    public ArrayList<Student>getStudents(){
    return (ArrayList<Student>) students.clone();
    }

    public ArrayList<Matter>getMatters(){
        return (ArrayList<Matter>) matters.clone();
    }


}
