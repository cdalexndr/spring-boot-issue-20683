package example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
@TestPropertySource(properties = {"some.prop=true"}) //comment this line for tests to work
public class SecondPersonServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired PersonService personService;

    //running only this test or changing test order for this test to run first and it will succeed
    @Test(priority = 1) //run second
    public void test() {
        personService.transactionalMethod();
    }
}