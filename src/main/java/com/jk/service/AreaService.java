package com.jk.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-06-29T20:15:02.239+08:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://service.jk.com/", name = "AreaService")
@XmlSeeAlso({ObjectFactory.class})
public interface AreaService {

    @RequestWrapper(localName = "dom4jXml", targetNamespace = "http://service.jk.com/", className = "com.jk.service.Dom4JXml")
    @WebMethod(operationName = "dom4jXml")
    @ResponseWrapper(localName = "dom4jXmlResponse", targetNamespace = "http://service.jk.com/", className = "com.jk.service.Dom4JXmlResponse")
    public void dom4JXml(
        @WebParam(name = "arg0", targetNamespace = "")
        com.jk.service.Area arg0
    );

    @RequestWrapper(localName = "findArea", targetNamespace = "http://service.jk.com/", className = "com.jk.service.FindArea")
    @WebMethod
    @ResponseWrapper(localName = "findAreaResponse", targetNamespace = "http://service.jk.com/", className = "com.jk.service.FindAreaResponse")
    public void findArea(
        @WebParam(name = "arg0", targetNamespace = "")
        com.jk.service.Area arg0
    );
}
