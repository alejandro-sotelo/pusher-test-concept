package co.com.testconcept.service.implementation;

import co.com.testconcept.service.WebsocketServer;
import com.pusher.rest.Pusher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class PusherServer implements WebsocketServer {

    private Pusher pusher;

    @Autowired
    public PusherServer(Pusher pusher) {
        this.pusher = pusher;
    }

    @Override
    public void triggerEvent(String transactionId){
        pusher.trigger("unique-channel", transactionId, Collections.singletonMap("message", "hello world: "+transactionId));
    }
}
