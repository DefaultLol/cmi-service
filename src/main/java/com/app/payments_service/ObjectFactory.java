//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 11:54:46 PM WET 
//


package com.app.payments_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.app.payments_service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.app.payments_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link GetBillsRequest }
     * 
     */
    public GetBillsRequest createGetBillsRequest() {
        return new GetBillsRequest();
    }

    /**
     * Create an instance of {@link GetBatchedPaymentRequest }
     * 
     */
    public GetBatchedPaymentRequest createGetBatchedPaymentRequest() {
        return new GetBatchedPaymentRequest();
    }

    /**
     * Create an instance of {@link GetFormsRequest }
     * 
     */
    public GetFormsRequest createGetFormsRequest() {
        return new GetFormsRequest();
    }

    /**
     * Create an instance of {@link GetBillsResponse }
     * 
     */
    public GetBillsResponse createGetBillsResponse() {
        return new GetBillsResponse();
    }

    /**
     * Create an instance of {@link ClientPaymentInfo }
     * 
     */
    public ClientPaymentInfo createClientPaymentInfo() {
        return new ClientPaymentInfo();
    }

    /**
     * Create an instance of {@link GetFormsResponse }
     * 
     */
    public GetFormsResponse createGetFormsResponse() {
        return new GetFormsResponse();
    }

    /**
     * Create an instance of {@link FormInfo }
     * 
     */
    public FormInfo createFormInfo() {
        return new FormInfo();
    }

    /**
     * Create an instance of {@link GetBatchedPaymentResponse }
     * 
     */
    public GetBatchedPaymentResponse createGetBatchedPaymentResponse() {
        return new GetBatchedPaymentResponse();
    }

    /**
     * Create an instance of {@link PaymentOpInfo }
     * 
     */
    public PaymentOpInfo createPaymentOpInfo() {
        return new PaymentOpInfo();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link BillInfo }
     * 
     */
    public BillInfo createBillInfo() {
        return new BillInfo();
    }

}
