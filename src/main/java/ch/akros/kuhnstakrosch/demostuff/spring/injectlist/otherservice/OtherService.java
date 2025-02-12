package ch.akros.kuhnstakrosch.demostuff.spring.injectlist.otherservice;

import ch.akros.kuhnstakrosch.demostuff.spring.injectlist.myservice.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherService {

  /*
  * Spring injects all beans implementing the interface MyService
  *
  # Note: the implementation classes are not visible here
  */
  private final List<MyService> myServices;

  OtherService(List<MyService> myServices) {
    this.myServices = myServices;
  }

  public void sayHelloFromAll() {
    myServices.forEach(MyService::sayHello);
  }

  public void sayHello(MyService.Type type) {
    getMyService(type).sayHello();
  }

  /*
  * use service type enum to get a service implementation from the injected list
  *
  # Note: the implementation classes are not visible here
  */
  //
  // (move this method to MyService as static method for production)
  private MyService getMyService(MyService.Type type) {
    return myServices.stream()
        .filter(service -> type == service.getType())
        .findAny()
        .orElseThrow();
  }
}
