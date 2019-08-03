package pl.sda.studentmodel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String lastname;
    private int index;

    @Override
    public String toString() {
        return "Student: " + '\n' +
                "Name: " + name + '\n' +
                "Lastname: " + lastname + '\n' +
                "Index: " + index + '\n';
    }
}
