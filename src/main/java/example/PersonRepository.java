package example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Lock(LockModeType.PESSIMISTIC_WRITE) //comment this line for tests to work
    Optional<Person> getByName( String name );
}
