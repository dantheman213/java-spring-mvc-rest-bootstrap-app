package myapp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) throws Throwable {
        try {
          Config config = new Config();
        } catch(Exception ex) {
          System.out.println("Unable to read env config!");
          ex.printStackTrace();
        }

        Logger.info("Starting application!");
        SpringApplication.run(Application.class, args);
    }

}
