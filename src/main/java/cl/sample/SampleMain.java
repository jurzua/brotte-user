package cl.sample;

import cl.sample.domain.Person;
import cl.sample.domain.Professor;
import cl.sample.domain.Student;

import java.util.List;

public class SampleMain {

    public static void main(String[] args) {

        PersonService service = new PersonService();


        List<Student> students = service.getStudents();

        for(Student item : students) {
            System.out.println(item);
        }

        System.out.println("_____________________________");

        List<Person> personList = service.getOlderThan(35);
        for(Person item : personList){
            System.out.println(item);
        }

        System.out.println("_____________________________");

        List<Person> personList1 = service.getByFirstNameAndType("ricardo", Professor.class);
        for(Person item : personList1){
            System.out.println(item);
        }
    }
}
