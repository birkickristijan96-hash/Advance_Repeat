package com.itacademy.one.oop;

import com.itacademy.one.apstraktne_klase_i_interfejsi.Searchable;
import com.itacademy.one.apstraktne_klase_i_interfejsi.Storable;

import java.io.Serializable;

/**
 * klasu naledujemo, a interface implementiramo
 * mozemo naslediti samo jednu klasu, ali mozemo implementirati vise interfacea
 */

public class Gamepad extends Product implements Storable, Searchable {
    boolean wireless;


    public Gamepad(String brand, String model, double price, boolean wireless) {
        super(brand, model, price);
        this.wireless = wireless;
    }

    @Override
    public void search() {

    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public int checkStock() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +  " Wirless : " + wireless;
    }
}
