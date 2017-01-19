package wang.ronnie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostsApplication {

    //http://blog.codeleak.pl/2014/08/spring-mvc-test-assert-given-model-attribute-global-errors.html
    public static void main(String[] args) {

        SpringApplication.run(PostsApplication.class, args);
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }

}
