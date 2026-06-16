package com.itacademy.one.apstraktne_klase_i_interfejsi;

import com.itacademy.one.oop.Gamepad;
import com.itacademy.one.oop.Monitor;
import com.itacademy.one.oop.Printer;

//klase moraju da bi se nasledile biti srodne
//klase koje implementiraju isti interfejs ne moraju biti srodne

public class JavaProgram {
    public static void main(String[] args) {
        Gamepad product1 = new Gamepad("Logitech", "F710", 129.99,true);
        Printer product2 = new Printer("HP", "Envy Photo 7155", 179.99,true);
        Monitor product3 = new Monitor("Dell", "U2419H", 219.99,24);
        //interface je i tip podatka
        //zato sto preko kljucne rijeci implements je demonstriran princip nasljedivanja
        //interface ispod haube se gleda kao klasa
        //klasa sa drugacijim osobinama
        Storable product4 = new Gamepad("Logitech", "F710", 129.99,true);

        //u pozadini se poziva i toString metoda poradi lepe reprezentacije objekta
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }

}
