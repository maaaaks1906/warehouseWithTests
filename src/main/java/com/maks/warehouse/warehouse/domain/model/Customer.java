package com.maks.warehouse.warehouse.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private String companyName;
    private String securityNumber;
    private String address;
    private String email;
    private String phoneNumber;

    //konstruktor dla kienta prywatnego
    public Customer(String firstName, String lastName, String securityNumber, String companyAddress, String companyEmail, String companyPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
        this.address = companyAddress;
        this.email = companyEmail;
        this.phoneNumber = companyPhoneNumber;
    }
}
