
package com.epam.lab.domain;

import com.epam.lab.wrapper.Places;
import com.epam.lab.wrapper.Response;
import com.epam.lab.wrapper.Users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.webservice package. 
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

    private final static QName _PlaceType_QNAME = new QName("http://webservice.lab.epam.com/", "place_type");
    private final static QName _Places_QNAME = new QName("http://webservice.lab.epam.com/", "places");
    private final static QName _Users_QNAME = new QName("http://webservice.lab.epam.com/", "users");
    private final static QName _User_QNAME = new QName("http://webservice.lab.epam.com/", "user");
    private final static QName _Place_QNAME = new QName("http://webservice.lab.epam.com/", "place");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Places }
     * 
     */
    public Places createPlaces() {
        return new Places();
    }

    /**
     * Create an instance of {@link PlaceType }
     * 
     */
    public PlaceType createPlaceType() {
        return new PlaceType();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lab.epam.com/", name = "place_type")
    public JAXBElement<PlaceType> createPlaceType(PlaceType value) {
        return new JAXBElement<PlaceType>(_PlaceType_QNAME, PlaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Places }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lab.epam.com/", name = "places")
    public JAXBElement<Places> createPlaces(Places value) {
        return new JAXBElement<Places>(_Places_QNAME, Places.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lab.epam.com/", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lab.epam.com/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lab.epam.com/", name = "place")
    public JAXBElement<Place> createPlace(Place value) {
        return new JAXBElement<Place>(_Place_QNAME, Place.class, null, value);
    }

}
