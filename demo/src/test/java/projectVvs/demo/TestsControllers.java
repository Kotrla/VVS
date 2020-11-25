package projectVvs.demo;

import org.apache.tomcat.util.http.parser.MediaType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.io.StringReader;

import static org.springframework.test.util.AssertionErrors.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = WelcomeController.class)
public class TestsControllers {


    @Autowired
    private WelcomeController welcomeController;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new WelcomeController()).build();
    }


    @Test
    public void testApplicationLload() {
        assertNotNull("WelcomeController not loaded",welcomeController);
    }

/*
   @Test
    public void testIfDataOk() throws Exception{
        String a = "application/json;charset=UTF-8";
        StringReader s = new StringReader(a);
         this.mockMvc.perform(get("/?age=22&gender=Male&height=197&weight=98")
                 .accept(MediaType.parseMediaType(a)))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));

    }*/

}
