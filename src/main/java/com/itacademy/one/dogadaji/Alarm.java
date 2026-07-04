package com.itacademy.one.dogadaji;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    private AlarmListener[] listeners = {};

    public void addListeer(AlarmListener alarmListener) {
        AlarmListener[] newListeners = new AlarmListener[listeners.length + 1];
        System.arraycopy(listeners, 0, newListeners, 0, listeners.length);
        newListeners[listeners.length] = alarmListener;
    }

    public void removeListener(AlarmListener alarmListener) {

        int indexOfElementToRemove = -1;

        for (int i = 0; i < listeners.length; i++) {
            if (alarmListener.equals(listeners[i]))
                indexOfElementToRemove = i;
        }


        AlarmListener[] newListeners = new AlarmListener[listeners.length - 1];

        System.arraycopy(listeners, 0, newListeners, 0, indexOfElementToRemove);

        System.arraycopy(listeners, indexOfElementToRemove + 1,
                newListeners, indexOfElementToRemove,
                listeners.length - indexOfElementToRemove - 1);

        listeners = newListeners;
    }

    public void setTimeFromNow(int millis) {
        Timer timer = new Timer("Timer");
        timer.schedule(new TimerTask() {
            public void run() {

                System.out.println("AlarmEvent triggered...");

                for (AlarmListener listener : listeners) {
                    AlaramEvent eventObj = new AlaramEvent(this, "Time is up!");
                    listener.alarmRang(eventObj);
                }

                System.exit(0);

            }
        }, millis);

    }

}
