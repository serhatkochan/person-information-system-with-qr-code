package tr.serhatkochan.personinformationsystemwithqrcode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@OpenAPIDefinition
//@SecurityScheme(name = "Authorization", type = SecuritySchemeType.APIKEY, in = SecuritySchemeIn.HEADER)
public class PersonInformationSystemWithQrCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonInformationSystemWithQrCodeApplication.class, args);
    }

    @Bean // Bean ile birlikte buranın bir nesne ve IOC'nin ihtiyacı olduğunu anlar ve oluşturup ekler.
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
