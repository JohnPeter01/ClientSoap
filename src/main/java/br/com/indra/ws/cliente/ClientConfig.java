package br.com.indra.ws.cliente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientConfig {

  @Value("http://localhost:8080/ServerSoap/serverSoap")
  private String defaultUri;

  @Bean
  public Jaxb2Marshaller marshaller() {
	  Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
      marshaller.setClassesToBeBound(new Class[] {
    		  br.com.indra.entidades.BuscaPessoa.class,
    		  br.com.indra.entidades.BuscaPessoaResponse.class,
    		  
    		  
      });
	  return marshaller;
  }

  @Bean
  public BuscaPessoaClient buscaPessoaClient(Jaxb2Marshaller marshaller) {
	  BuscaPessoaClient client = new BuscaPessoaClient();
	  client.setDefaultUri(defaultUri);
	  client.setMarshaller(marshaller);
	  client.setUnmarshaller(marshaller);
	  return client;
  }
}