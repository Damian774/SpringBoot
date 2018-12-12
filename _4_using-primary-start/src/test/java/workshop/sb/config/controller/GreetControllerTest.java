package workshop.sb.config.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import workshop.sb.config.controller.service.GreetService;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static workshop.sb.config.controller.service.GreetService.MSG;
import static workshop.sb.config.controller.service.impl.GreetServiceFirstImplementation.FIRST_IMPL;
import static workshop.sb.config.controller.service.impl.GreetServiceSecondImplementation.SECOND_IMPL;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private GreetController greetController;

    @Test
    public void shouldReturnGreetMsgFromFirstImpl() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(MSG)))
        .andExpect(content().string(containsString("from the")));




    }
}

// TODO 1 przed refaktoringiem uruchom test
// TODO 6 zaktualizuj test