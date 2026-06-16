package com.itacademy.one.oop;



public abstract class Product {
    //abstraktna klasa moze da bude tip podatka ali ne i njegova najuza specifikacija
    //dostupan u klasi u kojoj je dostupna i klasa

    //private -> znaci da je direktan pristup u ovom slucaju polju moguc u tijelu same klase Product, tj gdje je
    //polje kreirano, medutim, postoji nacin da se polju pristupi i van tela klase product
    //pomocu get i set metoda u zavisnosti od toga da li ocitavamo vrednost polja (get) ili postavljamo
    //vrednost polja (set).
    //sve ovo je posledica enkapsulacije, princip oop
    //prikrivanje informacija koje krajnjem korisniku nisu potrebne
    private String brand;
    private String model;
    private double price;
    private Object System;
    //definisanje polja u klasi
    //enkapsulacija - posledica get i set metode



    //this pokazuje na polje
    //this se moze koristiti samo u klasi gdje je polje kreirano
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //ovo je konstruktor metoda sluzi za kreiranje objekata
    //uvijek ima isti naziv kao i klasa


    //super - > sve sto je sa super se nalazi se u roditeljskoj klasi
    //-> prazan je ako roditeljski konstruktor metoda itd nemaju argumente
    public Product(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Object je bazna klasa->
    //vraca teksutalnu reprezentaciju objekta
    //redefinisanje metode -> override -> polimorfizam->oop princip
    //override -> ima identican potpis (zaglavlje) kao i metoda iz roditeljske klase
    //ali ima drugaciju logiku tj telo metode se razlikuje
    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand  +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';

    }

    //apstraktna metoda -> je metoda koja ne moze imati blok , ne moze sadrzavati logiku u ovoj klasi
    //ali mora imati u klasi koja nasledi ovu klasu
    //u slucaju da ta klasa je konkretna -> sve klase koje nemaju oznaku abstract su konkretne
    //apstraktne i konkretne klase
    public abstract int checkStock();
}
