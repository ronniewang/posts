package wang.ronnie;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PostsApplication.class)
@WebAppConfiguration
public class AccountValidationIntegrationTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {

        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void failsWhenEmptyPasswordsGiven() throws Exception {

        this.mockMvc.perform(post("/globalerrors/password")
                .param("password", "").param("confirmedPassword", ""))
                .andExpect(
                        model().attributeHasFieldErrors(
                                "passwordForm", "password", "confirmedPassword"
                        )
                )
                .andExpect(status().isOk())
                .andExpect(view().name("globalerrors/password"));
    }
}