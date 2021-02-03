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
 *         &lt;element name="billID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creancier" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "billID",
    "accountID",
    "creancier"
})
@XmlRootElement(name = "paymentRequest")
public class PaymentRequest {

    protected long billID;
    @XmlElement(required = true)
    protected String accountID;
    @XmlElement(required = true)
    protected String creancier;

    /**
     * Obtient la valeur de la propriété billID.
     * 
     */
    public long getBillID() {
        return billID;
    }

    /**
     * Définit la valeur de la propriété billID.
     * 
     */
    public void setBillID(long value) {
        this.billID = value;
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

}
