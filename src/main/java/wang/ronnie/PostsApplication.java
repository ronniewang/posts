package wang.ronnie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostsApplication {

    public static void main(String[] args) {

        SpringApplication.run(PostsApplication.class, args);
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {

        return "hello";
    }
}
