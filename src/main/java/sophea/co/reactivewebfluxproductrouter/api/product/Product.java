package sophea.co.reactivewebfluxproductrouter.api.product;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Document(collation = "products") // using @Document for annotated as Collection
public class Product {

    //MongoId represents a MongoDB specific Id annotation that allows customizing {@literal id} conversion.
    @MongoId
    private Integer id;

    private String uuid;

    @Field(name = "pro_name")
    private String proName;

    private String description;

    private LocalDateTime timestamp;


}
