package sophea.co.reactivewebfluxproductrouter.api.product.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import sophea.co.reactivewebfluxproductrouter.api.product.Product;
import sophea.co.reactivewebfluxproductrouter.api.product.ProductService;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @GetMapping
    public Flux<Product> getProducts(){

        return productService.getAllProducts();

    }

    @PostMapping
    public void createProduct(@RequestBody Product product){

        productService.createProduct(product);

    }


}
