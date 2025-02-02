package sheridan.yueyang.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TvShowApplication {
    public static void main(String[] args) {
        SpringApplication.run(TvShowApplication.class, args);
    }
}
