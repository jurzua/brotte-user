package cl.sample;

import cl.sample.domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    private List<Person> db;

    public PersonService() {
        db = new ArrayList<>();
        db.add(Student.builder().id(0L).firstName("ricardo").lastName("urzua").age(28).study("informatica").build());
        db.add(Student.builder().id(1L).firstName("jorge").lastName("urzua").age(36).study("informatica").build());
        db.add(Student.builder().id(2L).firstName("monika").lastName("Hoffman").age(33).study("economia").build());
        db.add(Professor.builder().id(3L).firstName("ricardo").lastName("maturana").age(44)
                .courses(Collections.singletonList("bilogia")).build());
        db.add(Professor.builder().id(4L).firstName("").lastName("").age(40).courses(Collections.singletonList("")).build());
    }

    /**
     * Method that returns all persons, whose type is Student
     */
    public List<Student> getStudents() {
        List<Student> result = new ArrayList<>();

        for (Person item : this.db) {
            if(item instanceof Student) {
                //casting from Person to Student
                result.add((Student) item);
            }
        }
        return result;
    }

}
