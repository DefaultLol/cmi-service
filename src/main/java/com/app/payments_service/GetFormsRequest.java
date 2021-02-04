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
 *         &lt;element name="codeCreance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creance" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codeCreance",
    "creance"
})
@XmlRootElement(name = "getFormsRequest")
public class GetFormsRequest {

    @XmlElement(required = true)
    protected String codeCreance;
    @XmlElement(required = true)
    protected String creance;

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

    /**
     * Obtient la valeur de la propriété creance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreance() {
        return creance;
    }

    /**
     * Définit la valeur de la propriété creance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreance(String value) {
        this.creance = value;
    }

}
