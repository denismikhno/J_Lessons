package homework.classes.equals_hashcode.task_2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Adress adress;

    public Person(String firstName, String lastName, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName == person.firstName && lastName == person.lastName && adress.equals(person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, adress);
    }
}
