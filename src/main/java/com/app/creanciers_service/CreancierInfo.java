//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 08:39:44 PM WET 
//


package com.app.creanciers_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creancierInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creancierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameCreancier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeCreancier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryCreancier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listCreances" type="{http://app.com/creanciers-service}creanceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creancierInfo", propOrder = {
    "id",
    "nameCreancier",
    "codeCreancier",
    "categoryCreancier",
    "listCreances"
})
public class CreancierInfo {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String nameCreancier;
    @XmlElement(required = true)
    protected String codeCreancier;
    @XmlElement(required = true)
    protected String categoryCreancier;
    @XmlElement(nillable = true)
    protected List<CreanceInfo> listCreances;

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
     * Obtient la valeur de la propriété nameCreancier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCreancier() {
        return nameCreancier;
    }

    /**
     * Définit la valeur de la propriété nameCreancier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCreancier(String value) {
        this.nameCreancier = value;
    }

    /**
     * Obtient la valeur de la propriété codeCreancier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCreancier() {
        return codeCreancier;
    }

    /**
     * Définit la valeur de la propriété codeCreancier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCreancier(String value) {
        this.codeCreancier = value;
    }

    /**
     * Obtient la valeur de la propriété categoryCreancier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCreancier() {
        return categoryCreancier;
    }

    /**
     * Définit la valeur de la propriété categoryCreancier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCreancier(String value) {
        this.categoryCreancier = value;
    }

    /**
     * Gets the value of the listCreances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCreances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCreances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreanceInfo }
     * 
     * 
     */
    public List<CreanceInfo> getListCreances() {
        if (listCreances == null) {
            listCreances = new ArrayList<CreanceInfo>();
        }
        return this.listCreances;
    }

}
