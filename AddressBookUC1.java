package com.bl.book;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddressBookUC1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        System.out.println();

        AddressBookUC1 ab = new AddressBookUC1();

        ab.addContact();

    }

    public void addContact() {

       HashMap<String,String> map = new LinkedHashMap<>();

       map.put("FirstName","Shivam");
       map.put("LastName","Pal");
       map.put("Address","1/683");
       map.put("City","Vasundhara");
       map.put("State","UP");
       map.put("zip","201012");
       map.put("PhoneNumber","9999295772");
       map.put("Email","shivamm.ppal@gmail.com");

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " +entry.getValue());

        }
   }
}
