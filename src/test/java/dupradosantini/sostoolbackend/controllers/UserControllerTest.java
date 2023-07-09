package dupradosantini.sostoolbackend.controllers;

import dupradosantini.sostoolbackend.domain.AppUser;
import dupradosantini.sostoolbackend.services.UserServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@CrossOrigin("*")
@Controller
@RequestMapping("/users")
public class UserControllerTest {
    @Mock
    UserServiceImpl userService;

    UserController userController;

    MockMvc mockMvc;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userController = new UserController(userService);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    void createUserWithEmailCorrectly() throws Exception{
        AppUser user = new AppUser("Marcio", "marcio@marcio", "marcio123");

        mockMvc.perform(post("/users/2")
                .contentType(MediaType.APPLICATION_JSON)
                .content(String.valueOf(user)))
                .andExpect(status().is4xxClientError());

    }

    @Test
    void createUserWithEmailWrong() throws Exception{
        AppUser user = new AppUser("Marcio1", "", "marcio123");

        mockMvc.perform(post("/users/2")
                .contentType(MediaType.APPLICATION_JSON)
                .content(String.valueOf(user)))
                .andExpect(status().is4xxClientError());
    }
}
