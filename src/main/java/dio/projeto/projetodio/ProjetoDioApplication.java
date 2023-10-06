package dio.projeto.projetodio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server URL.")})
@SpringBootApplication
public class ProjetoDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDioApplication.class, args);
	}

}
