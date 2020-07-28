package angel.roshambo.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureWebTestClient
public class FirstApplicationTests {
    
        @Autowired
        private WebTestClient webTestClient;
    
	@Test
	public void completeTest() {
            webTestClient.get()
                    .uri("/roshambo/playround?r1=SCISSORS&r2=ROCK")
                    .accept(MediaType.APPLICATION_JSON)
                    .exchange()
                    .expectStatus().isOk()
                    .expectBody()
                    .jsonPath("$.roundResult").isEqualTo("SECOND");
	}

}
