package org.example;

import org.example.HelloService;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    private HelloService helloService = new HelloService();

    @Test
    void testHello(){
        MatcherAssert.assertThat(helloService.hello("World"), Matchers.equalTo("Hello, World"));
    }
}
