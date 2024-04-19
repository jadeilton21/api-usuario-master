package api.usuario.segunda.doc;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    private Contact contato() {
        return new Contact(
                "jadeilton",
                "http://www.jaderasta.com.br",
                "jade@rasta.com.br");
    }
}
