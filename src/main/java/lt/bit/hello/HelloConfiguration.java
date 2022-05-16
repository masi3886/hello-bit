package lt.bit.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloConfiguration {

  @Primary
  @Bean("hello1")
  public HelloService getHelloService1() {
    return new HelloServiceImpl1();
  }

  @Bean("hello2")
  public HelloService getHelloService2() {
    return new HelloServiceImpl2();
  }

}
