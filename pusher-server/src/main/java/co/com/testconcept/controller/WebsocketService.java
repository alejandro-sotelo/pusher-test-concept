package co.com.testconcept.controller;

import co.com.testconcept.service.WebsocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class WebsocketService {

    @Autowired
    WebsocketServer websocketServer;

    @PostMapping(value = "hello")
    public void queryHelloEvent(@RequestBody String transactionId) {
        websocketServer.triggerEvent(transactionId);
    }
}
