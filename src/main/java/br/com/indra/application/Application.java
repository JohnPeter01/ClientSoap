package br.com.indra.application;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import br.com.indra.ws.cliente.BuscaPessoaClient;

@SpringBootApplication
@ComponentScan("br.com.indra.ws.cliente")
public class Application {

	public static void main(String[] args){
		
		SpringApplication.run(Application.class, args);		
	}
	@Autowired BuscaPessoaClient buscaPessoa;
	@Bean
	CommandLineRunner lookup(BuscaPessoaClient buscaPessoa) {
		return args -> {
			String nome = "Paulo";

			if (args.length > 0) {
				nome = args[0];
			}
			
			 buscaPessoa.buscaPessoa(nome);
		};
	}

}