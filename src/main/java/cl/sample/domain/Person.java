package cl.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Person {

    public Person() {}

    protected Long id;
    protected String firstName;
    protected String lastName;
    protected Integer age;
}
