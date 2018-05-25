import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-05-25
 * Time: 上午11:03
 */
@SpringBootApplication
@ComponentScan("com.course.server")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
