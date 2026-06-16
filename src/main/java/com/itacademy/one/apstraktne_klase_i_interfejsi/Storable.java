package com.itacademy.one.apstraktne_klase_i_interfejsi;

/**
 * interface je najvisi nivo apstrakcije
 * interface je sablon po kom se ponasa objekat
 */
public interface Storable {
    //interface ima javne apstraktne metode - > podrazuemvano


    //interface uvijek ima javne abstrapktne metode,
    //abstract i public ne moraju da se nuzno navode jer se podrazumijevaju.
    void read();
    void write();
    void update();
    void delete();

    //nisu apstraktne
    //sluzi kada zelim da dodam neko novo ponasanje ali da ga menjam na jednom mjestu, da ne radim 500 blokova novih
    default boolean exist(){
        method1();
        method2();
        return true;
    }

    //moguce su ali nisu nuzne u defaultu

    //ovo su privatne metode koje su namjenjene iskljucivo za lokalnu upotrebu i u njih se smjesta neka pomocna logika
    //u prijevodu -> to znaci da nam one sluze da razlozimo kompleksnost problema koji treba da rijesimo default metodom

    
    private void method1(){
        System.out.println("hallo from private method1");
    }

    private void method2(){
        System.out.println("hallo from private method2");
    }
}
