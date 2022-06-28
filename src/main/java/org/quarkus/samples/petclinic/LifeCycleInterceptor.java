package org.quarkus.samples.petclinic;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class LifeCycleInterceptor {

    void onStart(@Observes StartupEvent e) {
        System.out.println("Startup observed");
    }

    void onStop(@Observes ShutdownEvent e) {
        System.out.println("Shutdown observed");
        while(true) {
            
        }
    }

    
}
