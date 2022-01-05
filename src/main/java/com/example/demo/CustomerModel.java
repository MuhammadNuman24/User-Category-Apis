package com.example.demo;

public class CustomerModel {
    private long webId;
    private String customerNumber;
    private String gender;
    private String dob;
    private address address;
    private CustomerContactDetail contactModel;
    private Long remainingBalance;
    private Long unpaidInvoiceCount;
    private boolean active;
    private long enterpriseId;
    private String externalKey;

    public CustomerModel(long webId, String customerNumber, String gender, String dob, com.example.demo.address address, CustomerContactDetail contactModel, Long remainingBalance, Long unpaidInvoiceCount, boolean active, long enterpriseId, String externalKey, String mainAddressId) {
        this.webId = webId;
        this.customerNumber = customerNumber;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.contactModel = contactModel;
        this.remainingBalance = remainingBalance;
        this.unpaidInvoiceCount = unpaidInvoiceCount;
        this.active = active;
        this.enterpriseId = enterpriseId;
        this.externalKey = externalKey;
        this.mainAddressId = mainAddressId;
    }

    private String mainAddressId;
}

class CustomerContactDetail {
    private long webId;
    private long enterpriseId;

    public CustomerContactDetail(long webId, long enterpriseId, String dateCreated, String dateUpdated, String externalKey, String information, String main, String extension, String addressId, String contactId, boolean deleted) {
        this.webId = webId;
        this.enterpriseId = enterpriseId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.externalKey = externalKey;
        this.information = information;
        this.main = main;
        this.extension = extension;
        this.addressId = addressId;
        this.contactId = contactId;
        this.deleted = deleted;
    }

    private  String dateCreated ;
    private  String dateUpdated ;
    private  String externalKey;
     private  String information;
    private  String main;
    private String  extension;
   private String  addressId;
    private  String contactId;
     private boolean deleted;
}
class address {
    private String name;
    private String postalCode;

    public address(String name, String postalCode, String state, String street, String city, String country) {
        this.name = name;
        this.postalCode = postalCode;
        this.state = state;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    private String state;
    private String street;
    private String city;
    private String country;
};