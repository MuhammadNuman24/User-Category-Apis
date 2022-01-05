package com.example.demo;

import java.util.List;

public class UserModel {
    private long webId;
    private String name;
    private List<String> image;
    private long userNumber;
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String state;
    private String company;
    private String phoneNumber;
    private String carrierNetwork;
    private String gender;
    private String dob;
    private String country;
    private String city;
    private String address;
    private String postalCode;

    public UserModel(long webId, String name, List<String> image, long userNumber, String title, String firstName, String lastName, String email, String state, String company, String phoneNumber, String carrierNetwork, String gender, String dob, String country, String city, String address, String postalCode) {
        this.webId = webId;
        this.name = name;
        this.image = image;
        this.userNumber = userNumber;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.state = state;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.carrierNetwork = carrierNetwork;
        this.gender = gender;
        this.dob = dob;
        this.country = country;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
    }

    public long getWebId() {
        return webId;
    }

    public void setWebId(long webId) {
        this.webId = webId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrierNetwork() {
        return carrierNetwork;
    }

    public void setCarrierNetwork(String carrierNetwork) {
        this.carrierNetwork = carrierNetwork;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

