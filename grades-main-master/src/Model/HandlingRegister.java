package Model;

import logic.Student;

import java.util.ArrayList;
import java.util.Optional;

public class HandlingRegister {
    private ArrayList<Student> students;

    public HandlingRegister() {
    students= new ArrayList<>();
    }

    public void addStudent(Student student){
    students.add(student);
    }

    public Student findStudent(String codeS){
    Optional<Student> student= students.stream().filter(b -> b.getCode().equals(codeS)).findFirst();
    return student.isPresent() ? student.get() : null;
    }

    public ArrayList<Student>getStudents(){
    return (ArrayList<Student>) students.clone();
    }


}
