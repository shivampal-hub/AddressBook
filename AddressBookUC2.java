package com.bl.book;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AddressBookUC2 {

    HashMap<String,String> map = new LinkedHashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        System.out.println();
        System.out.println("Enter details of new person");

        AddressBookUC2 book = new AddressBookUC2();
        book.addContact();

        AddressBookUC2 m = new Method();
        m.addContact();

        System.out.println(book.map);

    }

    public void addContact() {

        map.put("FirstName","Shivam");
        map.put("LastName","Pal");
        map.put("Address","1/683");
        map.put("City","Vasundhara");
        map.put("State","UP");
        map.put("zip","201012");
        map.put("PhoneNumber","9999295772");
        map.put("Email","shivamm.ppal@gmail.com");

    }
}
