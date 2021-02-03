//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 08:39:44 PM WET 
//


package com.app.payments_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientPaymntInfo" type="{http://app.com/payments-service}clientPaymentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientPaymntInfo"
})
@XmlRootElement(name = "getBillsResponse")
public class GetBillsResponse {

    @XmlElement(required = true)
    protected ClientPaymentInfo clientPaymntInfo;

    /**
     * Obtient la valeur de la propriété clientPaymntInfo.
     * 
     * @return
     *     possible object is
     *     {@link ClientPaymentInfo }
     *     
     */
    public ClientPaymentInfo getClientPaymntInfo() {
        return clientPaymntInfo;
    }

    /**
     * Définit la valeur de la propriété clientPaymntInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientPaymentInfo }
     *     
     */
    public void setClientPaymntInfo(ClientPaymentInfo value) {
        this.clientPaymntInfo = value;
    }

}
