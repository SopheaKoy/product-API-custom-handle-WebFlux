package sophea.co.reactivewebfluxproductrouter.api.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // created method for get Products
    public Flux<Product> getAllProducts(){

        return productRepository.findAll().delayElements(Duration.ofSeconds(2));
    }

    public Mono<Product> createProduct(Product product){

        Product product1 = Product.builder()
                .id(product.getId())
                .uuid(UUID.randomUUID().toString())
                .proName(product.getProName())
                .description(product.getDescription())
                .timestamp(LocalDateTime.now())
                .build();

        return productRepository.save(product1);
    }

}
