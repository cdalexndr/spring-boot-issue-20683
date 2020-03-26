package example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Person() {
    }

    public Person( String name ) {
        this.name = name;
    }

    @Override public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals( person.name );
    }

    @Override public int hashCode() {
        return Objects.hash( name );
    }
}
