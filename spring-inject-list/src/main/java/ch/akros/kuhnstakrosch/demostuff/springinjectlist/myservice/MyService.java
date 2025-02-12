package ch.akros.kuhnstakrosch.demostuff.springinjectlist.myservice;

import org.springframework.stereotype.Service;

/*
* public service definition
*/

public interface MyService {

  void sayHello();

  // enum to identify service implementation
  enum Type {
    FOO,
    BAR
  }

  Type getType();
}

/*
* non-public service implementations
*/

@Service
class MyServiceFoo implements MyService {

  @Override
  public void sayHello() {
    System.out.println(getType().name() + " says hello from FOO");
  }

  @Override
  public Type getType() {
    return Type.FOO;
  }
}

@Service
class MyServiceBar implements MyService {

  @Override
  public void sayHello() {
    System.out.println(getType().name() + " says hello from BAR");
  }

  @Override
  public Type getType() {
    return Type.BAR;
  }
}
