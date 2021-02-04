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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour billInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="billInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="payedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="payed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isBatched" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codeCreance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billInfo", propOrder = {
    "id",
    "amount",
    "billingDate",
    "payedDate",
    "payed",
    "isBatched",
    "codeCreance"
})
public class BillInfo {

    protected long id;
    protected double amount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payedDate;
    protected boolean payed;
    protected boolean isBatched;
    @XmlElement(required = true)
    protected String codeCreance;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    public boolean getPayed(){
        return payed;
    }

    public boolean getIsBatched(){
        return isBatched;
    }

    /**
     * Obtient la valeur de la propriété billingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Définit la valeur de la propriété billingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Obtient la valeur de la propriété payedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayedDate() {
        return payedDate;
    }

    /**
     * Définit la valeur de la propriété payedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayedDate(XMLGregorianCalendar value) {
        this.payedDate = value;
    }

    /**
     * Obtient la valeur de la propriété payed.
     * 
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     * Définit la valeur de la propriété payed.
     * 
     */
    public void setPayed(boolean value) {
        this.payed = value;
    }

    /**
     * Obtient la valeur de la propriété isBatched.
     * 
     */
    public boolean isIsBatched() {
        return isBatched;
    }

    /**
     * Définit la valeur de la propriété isBatched.
     * 
     */
    public void setIsBatched(boolean value) {
        this.isBatched = value;
    }

    /**
     * Obtient la valeur de la propriété codeCreance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCreance() {
        return codeCreance;
    }

    /**
     * Définit la valeur de la propriété codeCreance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCreance(String value) {
        this.codeCreance = value;
    }

}
