package nl.quintor.minor.cnsd.blok1.b4fservice.controller;

import nl.quintor.minor.cnsd.blok1.b4fservice.clients.HelloServiceClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class FrontendApiController {

    @Inject
    public HelloServiceClient helloServiceClient;

    @RequestMapping("/hello")
    public String home() {
        return helloServiceClient.hello();
    }
}
