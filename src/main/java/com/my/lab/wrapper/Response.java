
package com.epam.lab.wrapper;

import com.epam.lab.domain.Place;
import com.epam.lab.domain.User;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://webservice.lab.epam.com/}user"/>
 *           &lt;element ref="{http://webservice.lab.epam.com/}place"/>
 *           &lt;element ref="{http://webservice.lab.epam.com/}users"/>
 *           &lt;element ref="{http://webservice.lab.epam.com/}places"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://webservice.lab.epam.com/}user"/>
 *           &lt;element ref="{http://webservice.lab.epam.com/}place"/>
 *         &lt;/choice>
 *         &lt;element name="status" type="{http://webservice.lab.epam.com/}status" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "user",
    "place",
    "users",
    "places",
    "userOrPlace",
    "status",
    "message"
})
public class Response {

    @XmlElement(namespace = "http://webservice.lab.epam.com/")
    protected User user;
    @XmlElement(namespace = "http://webservice.lab.epam.com/")
    protected Place place;
    @XmlElement(namespace = "http://webservice.lab.epam.com/")
    protected Users users;
    @XmlElement(namespace = "http://webservice.lab.epam.com/")
    protected Places places;
    @XmlElements({
        @XmlElement(name = "user", namespace = "http://webservice.lab.epam.com/", type = User.class),
        @XmlElement(name = "place", namespace = "http://webservice.lab.epam.com/", type = Place.class)
    })
    protected List<Object> userOrPlace;
    @XmlSchemaType(name = "string")
    protected Status status;
    protected String message;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link Place }
     *     
     */
    public Place getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link Place }
     *     
     */
    public void setPlace(Place value) {
        this.place = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the places property.
     * 
     * @return
     *     possible object is
     *     {@link Places }
     *     
     */
    public Places getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     * @param value
     *     allowed object is
     *     {@link Places }
     *     
     */
    public void setPlaces(Places value) {
        this.places = value;
    }

    /**
     * Gets the value of the userOrPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userOrPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserOrPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * {@link Place }
     * 
     * 
     */
    public List<Object> getUserOrPlace() {
        if (userOrPlace == null) {
            userOrPlace = new ArrayList<Object>();
        }
        return this.userOrPlace;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
