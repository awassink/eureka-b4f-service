package nl.quintor.minor.cnsd.blok1.b4fservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello-service")
public interface HelloServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
