package sewteam.simplebackend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sewteam.simplebackend.controllers.SimpleController;

@SpringBootTest
class SimpleBackendApplicationTests {

    @Test
    void contextLoads() {
        SimpleController controller = new SimpleController();
        Assertions.assertEquals("Data from backend.", controller.sendData());
    }

}
