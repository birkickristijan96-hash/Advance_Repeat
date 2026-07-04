package com.itacademy.one.dogadaji;

import java.util.EventObject;

public class AlaramEvent extends EventObject {

    String message;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public AlaramEvent(Object source, String message) {
        super(source);
        this.message=message;
    }
}
