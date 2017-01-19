package wang.ronnie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {

        mockMvc.perform(get("/greeting").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(model().attribute("name", "World"));
    }

    private static final String[] NO_ARGS = {};

    @Rule
    public OutputCapture out = new OutputCapture();

    @Test
    public void outputResults() throws Exception {
        SampleJooqApplication.main(NO_ARGS);
        assertThat(this.out.toString()).contains("jOOQ Fetch 1 Greg Turnquest");
        assertThat(this.out.toString()).contains("jOOQ Fetch 2 Craig Walls");
        assertThat(this.out.toString())
                .contains("jOOQ SQL " + "[Learning Spring Boot : Greg Turnquest, "
                        + "Spring Boot in Action : Craig Walls]");
    }

}
