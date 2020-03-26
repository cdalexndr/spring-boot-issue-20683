package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class FirstPersonServiceTest extends AbstractTransactionalTestNGSpringContextTests {
    @Autowired PersonService personService;

    @Test(priority = 0) //run first
    public void test() {
        personService.transactionalMethod();
    }
}
