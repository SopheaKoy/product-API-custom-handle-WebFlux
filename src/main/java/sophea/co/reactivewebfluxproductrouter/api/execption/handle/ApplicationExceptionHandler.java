package sophea.co.reactivewebfluxproductrouter.api.execption.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(ProductAPIException.class)
    public ResponseEntity<?> handleUserAPIException(ProductAPIException bookAPIException , HttpStatus status){

        Map<String, String> errorMap = new HashMap<>();

        errorMap.put("error message", bookAPIException.getMessage());

        errorMap.put("status", status.toString());

        return ResponseEntity.ok(errorMap);
    }
}
