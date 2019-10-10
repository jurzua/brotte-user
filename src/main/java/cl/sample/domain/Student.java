package cl.sample.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Student extends Person {

    @Builder
    public Student(Long id, String lastName, String firstName, Integer age, String study) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.study = study;
        this.age = age;
    }

    private String study;

}
