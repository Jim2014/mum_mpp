package edu.mum.cs.cs401.entity;


import java.util.List;

/**
 * Created by 985333 on 9/13/2016.
 */
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private List<Address> addresses;
    private String phoneNumber;
    private String username;
    private String password;
    public final static String ADMIN="A";
    public final static  String LIBRARIAN="L";
    public final static  String ADMINLIBRARIAN="A&L";
    public final static  String MEMBER="M";

    private String role;

    public Person(String id, String firstName, String lastName, List<Address> addresses, String phoneNumber, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
        this.phoneNumber = phoneNumber;
        this.role = role;

    }



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
