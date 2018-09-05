package springboot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication

public class Apptest extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Apptest.class);
    }

    public static void main(String[] args) {
        System.out.println("**********app***************");
        SpringApplication.run(new Object[]{Apptest.class}, args);
    }
}
