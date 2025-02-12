package ch.akros.kuhnstakrosch.demostuff.springinjectlist;

import ch.akros.kuhnstakrosch.demostuff.springinjectlist.myservice.MyService;
import ch.akros.kuhnstakrosch.demostuff.springinjectlist.otherservice.OtherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringInjectListApplicationTests {

  @Autowired
  private OtherService otherService;

  @Test
  void otherService() {
    
    System.out.println("Start to say hello from all");
    otherService.sayHelloFromAll();

    System.out.println("Start to say hello from type BAR");
    otherService.sayHello(MyService.Type.BAR);
  }
}
