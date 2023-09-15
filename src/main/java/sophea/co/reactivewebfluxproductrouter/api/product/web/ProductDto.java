package sophea.co.reactivewebfluxproductrouter.api.product.web;


import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private String uuid;

    private String proName;

    private String description;

    private LocalDateTime timestamp;
}
