package org.quarkus.samples.petclinic;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(Application.class, args);
    }

    public static class Application implements QuarkusApplication {
        
        @Override
        public int run(String... args) throws Exception {
            System.out.println("Did we get here?");
            Quarkus.waitForExit();
            while(true) {

            }
        }
    }
    
}
