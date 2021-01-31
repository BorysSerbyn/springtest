package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping(
            path = "/hello",
            produces = APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> hello(@RequestParam(name = "name") String name) {
        String message = helloService.hello(name);
        return ResponseEntity.ok(message);
    }
}
