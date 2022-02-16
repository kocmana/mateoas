package at.kocmana.mateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.mediatype.hal.HalLinkDiscoverer;

@SpringBootApplication
public class MateoasApplication {

  public static void main(String[] args) {
    SpringApplication.run(MateoasApplication.class, args);
  }

}
