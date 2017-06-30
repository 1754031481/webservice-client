
package com.jk.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jk.service package. 
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

    private final static QName _Dom4JXml_QNAME = new QName("http://service.jk.com/", "dom4jXml");
    private final static QName _Dom4JXmlResponse_QNAME = new QName("http://service.jk.com/", "dom4jXmlResponse");
    private final static QName _FindArea_QNAME = new QName("http://service.jk.com/", "findArea");
    private final static QName _FindAreaResponse_QNAME = new QName("http://service.jk.com/", "findAreaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jk.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dom4JXml }
     * 
     */
    public Dom4JXml createDom4JXml() {
        return new Dom4JXml();
    }

    /**
     * Create an instance of {@link Dom4JXmlResponse }
     * 
     */
    public Dom4JXmlResponse createDom4JXmlResponse() {
        return new Dom4JXmlResponse();
    }

    /**
     * Create an instance of {@link FindArea }
     * 
     */
    public FindArea createFindArea() {
        return new FindArea();
    }

    /**
     * Create an instance of {@link FindAreaResponse }
     * 
     */
    public FindAreaResponse createFindAreaResponse() {
        return new FindAreaResponse();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dom4JXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jk.com/", name = "dom4jXml")
    public JAXBElement<Dom4JXml> createDom4JXml(Dom4JXml value) {
        return new JAXBElement<Dom4JXml>(_Dom4JXml_QNAME, Dom4JXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dom4JXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jk.com/", name = "dom4jXmlResponse")
    public JAXBElement<Dom4JXmlResponse> createDom4JXmlResponse(Dom4JXmlResponse value) {
        return new JAXBElement<Dom4JXmlResponse>(_Dom4JXmlResponse_QNAME, Dom4JXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jk.com/", name = "findArea")
    public JAXBElement<FindArea> createFindArea(FindArea value) {
        return new JAXBElement<FindArea>(_FindArea_QNAME, FindArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jk.com/", name = "findAreaResponse")
    public JAXBElement<FindAreaResponse> createFindAreaResponse(FindAreaResponse value) {
        return new JAXBElement<FindAreaResponse>(_FindAreaResponse_QNAME, FindAreaResponse.class, null, value);
    }

}
