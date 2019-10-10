package cl.sample;

import cl.sample.domain.Student;

import java.util.List;

public class SampleMain {

    public static void main(String[] args) {

        PersonService service = new PersonService();


        List<Student> students = service.getStudents();

        for(Student item : students) {
            System.out.println(item);
        }

    }
}
