package co.com.testconcept.configuration;

import com.pusher.rest.Pusher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PusherConfiguration {

    @Bean
    public Pusher pusher(){
        final Pusher pusher = new Pusher("698936", "65cfd3f7234ca52ff797", "42b69e76ca1bdcff04f7");
        pusher.setCluster("mt1");
        pusher.setEncrypted(true);
        return pusher;
    }
}
