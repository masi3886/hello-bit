package lt.bit.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {

  private static final Logger LOG = LoggerFactory.getLogger(HelloApplication.class);
  private HelloService helloService;

  @Qualifier("hello2")
  @Autowired
  private HelloService newHelloService;

  public HelloApplication(HelloService helloService) {
    this.helloService = helloService;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

  @Override
  public void run(String... args) {
    LOG.debug("Hello " + helloService.getName());
    LOG.debug("Hello " + newHelloService.getName());
  }
}
