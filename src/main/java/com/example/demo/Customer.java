package com.example.demo;


import javax.persistence.*;

/*
 `company` (
  `companyID` int(11) NOT NULL AUTO_INCREMENT,
  `Company` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`companyID`)
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=utf8;
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerid")
    private long id;
    @Column(name="title")
    private String  title;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="streetaddress")
    private String streetAddress;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipCode;
    @Column(name="emailaddress")
    private String emailAddress;

    public Customer() {
    }

    public Customer(String title, String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String emailAddress) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emailAddress = emailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
