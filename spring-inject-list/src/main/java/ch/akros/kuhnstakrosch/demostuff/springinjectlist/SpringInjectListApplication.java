package ch.akros.kuhnstakrosch.demostuff.springinjectlist;

import ch.akros.kuhnstakrosch.demostuff.springinjectlist.myservice.MyService;
import ch.akros.kuhnstakrosch.demostuff.springinjectlist.otherservice.OtherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInjectListApplication implements CommandLineRunner {

  private final OtherService otherService;

  public SpringInjectListApplication(OtherService otherService) {
    this.otherService = otherService;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringInjectListApplication.class, args);
  }

  // run a demo
  @Override
  public void run(String... args) {

    System.out.println("Start to say hello from all");
    otherService.sayHelloFromAll();

    System.out.println("Start to say hello from type BAR");
    otherService.sayHello(MyService.Type.BAR);
  }
}
