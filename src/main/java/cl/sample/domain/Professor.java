package cl.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Professor extends Person {

    @Builder
    public Professor(Long id, String lastName, String firstName, Integer age, List<String> courses) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courses = courses;
        this.age = age;
    }

    private List<String> courses;

}
