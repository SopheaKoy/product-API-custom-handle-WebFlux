package sophea.co.reactivewebfluxproductrouter.api.router;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProductRouter {

    // Router in WebFlux is the same Controller in Web MVC.
    // Created WebProperties Resource
    @Bean
    public WebProperties.Resources resources(){
        return new WebProperties.Resources();
    }


}
