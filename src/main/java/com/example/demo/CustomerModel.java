package com.example.demo;

public class CustomerModel {
    private long webId;
    private String customerNumber;
    private String gender;
    private String dob;
    private address address;
    private CustomerContactDetail contactModel;
    private boolean active;
    private String mainAddressId;

    public CustomerModel(long webId, String customerNumber, String gender, String dob, com.example.demo.address address, CustomerContactDetail contactModel, boolean active,String mainAddressId) {
        this.webId = webId;
        this.customerNumber = customerNumber;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.contactModel = contactModel;
        this.active = active;
        this.mainAddressId = mainAddressId;
    }
}

class CustomerContactDetail {
    private long webId;
    private long enterpriseId;
    private  String dateCreated ;
    private  String dateUpdated ;
    private  String externalKey;
     private  String information;
    private  String main;
    private String  extension;
   private String  addressId;
    private  String contactId;
     private boolean deleted;
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

    public long getWebId() {
        return webId;
    }

    public void setWebId(long webId) {
        this.webId = webId;
    }

    public long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
class address {
    private String postalCode;
    private String state;
    private String street;
    private String city;
    private String country;
    public address(String postalCode, String state, String street, String city, String country) {
        this.postalCode = postalCode;
        this.state = state;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
};