package br.com.indra.ws.cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.indra.entidades.BuscaPessoa;
import br.com.indra.entidades.BuscaPessoaResponse;


@Component
public class BuscaPessoaClient extends WebServiceGatewaySupport {

  private static final Logger LOGGER = LoggerFactory.getLogger(BuscaPessoaClient.class);

  public BuscaPessoaResponse buscaPessoa(String nome) {
	  BuscaPessoa pessoa = new BuscaPessoa();
	 pessoa.setArg0(nome);
	 
    LOGGER.info("Client sending Pessoa[Nome={}]", pessoa.getArg0());
  
     BuscaPessoaResponse response = (BuscaPessoaResponse) getWebServiceTemplate()
			.marshalSendAndReceive("http://localhost:8080/ServerSoap/serverSoap",
					pessoa,
					new SoapActionCallback("http://localhost:8080/ServerSoap/serverSoap"));
    
    
    LOGGER.info("Client received Respostas='{}'", response.getReturn());
  
    
    
    return response;
  }
}