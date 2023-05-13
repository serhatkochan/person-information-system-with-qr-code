package tr.serhatkochan.personinformationsystemwithqrcode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.exceptions.BusinessException;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.exceptions.ProblemDetails;
import tr.serhatkochan.personinformationsystemwithqrcode.core.utilities.exceptions.ValidationProblemDetails;

import java.util.HashMap;

@SpringBootApplication
@RestControllerAdvice // AOP, bütün hatalar aşağıdaki exceptionHandler'a taabi
//@OpenAPIDefinition
//@SecurityScheme(name = "Authorization", type = SecuritySchemeType.APIKEY, in = SecuritySchemeIn.HEADER)
public class PersonInformationSystemWithQrCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonInformationSystemWithQrCodeApplication.class, args);
    }

    @ExceptionHandler
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException) { // businessException alırsan sen çalış
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setMessage(businessException.getMessage());
        return problemDetails;
    }

    @ExceptionHandler
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException) {
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setMessage("VALIDATION.EXCEPTION");
        validationProblemDetails.setValidationErrors(new HashMap<String, String>());

        for (FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()) {
            validationProblemDetails.getValidationErrors().put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return validationProblemDetails;
    }


    @Bean // Bean ile birlikte buranın bir nesne ve IOC'nin ihtiyacı olduğunu anlar ve oluşturup ekler.
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
