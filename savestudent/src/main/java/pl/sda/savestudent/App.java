package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Jakub","2",3);
        Student student2 = new Student("4","5",6);
        Student student3 = new Student("7","8",9);
        Student student4 = new Student("10","11",12);
        Student student5 = new Student("13","14",15);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("data.json"),students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
