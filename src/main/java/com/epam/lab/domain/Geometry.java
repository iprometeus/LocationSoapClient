
package com.epam.lab.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SRID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geometry", propOrder = {
    "srid",
    "userData"
})
@XmlSeeAlso({
    Point.class
})
public abstract class Geometry {

    @XmlElement(name = "SRID")
    protected int srid;
    protected Object userData;

    /**
     * Gets the value of the srid property.
     * 
     */
    public int getSRID() {
        return srid;
    }

    /**
     * Sets the value of the srid property.
     * 
     */
    public void setSRID(int value) {
        this.srid = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserData(Object value) {
        this.userData = value;
    }

}
