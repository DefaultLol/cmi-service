//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 11:54:46 PM WET 
//


package com.app.payments_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour paymentOpInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="paymentOpInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bill" type="{http://app.com/payments-service}billInfo"/>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creancier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentOpInfo", propOrder = {
    "id",
    "bill",
    "accountID",
    "creancier",
    "status"
})
public class PaymentOpInfo {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected BillInfo bill;
    @XmlElement(required = true)
    protected String accountID;
    @XmlElement(required = true)
    protected String creancier;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété bill.
     * 
     * @return
     *     possible object is
     *     {@link BillInfo }
     *     
     */
    public BillInfo getBill() {
        return bill;
    }

    /**
     * Définit la valeur de la propriété bill.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInfo }
     *     
     */
    public void setBill(BillInfo value) {
        this.bill = value;
    }

    /**
     * Obtient la valeur de la propriété accountID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Définit la valeur de la propriété accountID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Obtient la valeur de la propriété creancier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreancier() {
        return creancier;
    }

    /**
     * Définit la valeur de la propriété creancier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreancier(String value) {
        this.creancier = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
