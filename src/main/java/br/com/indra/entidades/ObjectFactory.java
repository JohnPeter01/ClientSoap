//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.24 às 02:25:59 PM BRT 
//


package br.com.indra.entidades;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the classes.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaPessoa_QNAME = new QName("http://ws.joni.com.br/", "buscaPessoa");
    private final static QName _BuscaPessoaResponse_QNAME = new QName("http://ws.joni.com.br/", "buscaPessoaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: classes.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaPessoa }
     * 
     */
    public BuscaPessoa createBuscaPessoa() {
        return new BuscaPessoa();
    }

    /**
     * Create an instance of {@link BuscaPessoaResponse }
     * 
     */
    public BuscaPessoaResponse createBuscaPessoaResponse() {
        return new BuscaPessoaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.joni.com.br/", name = "buscaPessoa")
    public JAXBElement<BuscaPessoa> createBuscaPessoa(BuscaPessoa value) {
        return new JAXBElement<BuscaPessoa>(_BuscaPessoa_QNAME, BuscaPessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.joni.com.br/", name = "buscaPessoaResponse")
    public JAXBElement<BuscaPessoaResponse> createBuscaPessoaResponse(BuscaPessoaResponse value) {
        return new JAXBElement<BuscaPessoaResponse>(_BuscaPessoaResponse_QNAME, BuscaPessoaResponse.class, null, value);
    }

}
