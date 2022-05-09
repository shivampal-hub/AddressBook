package com.bl.book;

public class Method extends AddressBookUC2{

    @Override
    public void addContact() {

        for(int i = 0; i < 8; i++ ){

            UserInput in = new UserInput();
            in.input();

            map.put(in.a,in.b);

        }
        System.out.println(map);
    }
}
