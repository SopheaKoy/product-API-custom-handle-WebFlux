package sophea.co.reactivewebfluxproductrouter.api.init;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import sophea.co.reactivewebfluxproductrouter.api.product.Product;
import sophea.co.reactivewebfluxproductrouter.api.product.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final ProductRepository productRepository;
    @PostConstruct
    void init(){

        Product product = Product.builder()
                .id(1)
                .uuid(UUID.randomUUID().toString())
                .proName("iPhone")
                .description("Use for call")
                .timestamp(LocalDateTime.now())
                .build();
        Product product1 = Product.builder()
                .id(2)
                .uuid(UUID.randomUUID().toString())
                .proName("iPhone")
                .description("Use for call")
                .timestamp(LocalDateTime.now())
                .build();

        productRepository.saveAll(List.of(product, product1));
    }
}
