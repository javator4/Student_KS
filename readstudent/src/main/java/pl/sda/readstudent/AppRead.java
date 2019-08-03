package pl.sda.readstudent;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppRead {
    public static void main(String[] args) {
        //List<Student> students = new ArrayList<>();
        Student[] students = new Student[10];
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            students = objectMapper.readValue(new File("data.json"),Student[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(Student student: students) {
            System.out.println(student);
        }
    }



}
