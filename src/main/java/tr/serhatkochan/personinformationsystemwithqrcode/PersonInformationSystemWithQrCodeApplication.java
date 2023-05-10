package tr.serhatkochan.personinformationsystemwithqrcode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Qr Kod ile Kişi Bilgi Sistemi",
                version = "0.0.1",
                description = "Açıklama",
                license = @License(
                        name = "Lisans Adı"
                ),
                contact = @Contact(
                        name = "Mail Serhat",
                        email = "serhatkochan@hotmail.com.tr"
                )
        )
)
public class PersonInformationSystemWithQrCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonInformationSystemWithQrCodeApplication.class, args);
    }

}
