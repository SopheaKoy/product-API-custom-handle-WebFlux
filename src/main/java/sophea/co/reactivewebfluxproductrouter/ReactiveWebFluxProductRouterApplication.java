package sophea.co.reactivewebfluxproductrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ReactiveWebFluxProductRouterApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReactiveWebFluxProductRouterApplication.class, args);
    }

}
