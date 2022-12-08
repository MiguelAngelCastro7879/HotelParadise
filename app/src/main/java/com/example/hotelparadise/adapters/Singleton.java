package com.example.hotelparadise.adapters;

import com.example.hotelparadise.models.Habitacion;

import java.util.ArrayList;
import java.util.List;

public final class Singleton {
    private static List<Habitacion> favoritos;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static List<Habitacion> getInstance(Habitacion habitacion) {
        if (favoritos == null) {
            favoritos = new ArrayList<>();
        }
        favoritos.add(habitacion);
        return favoritos;
    }

    public static List<Habitacion> getFavs(){
        if (favoritos == null) {
            favoritos = new ArrayList<>();
        }
        return favoritos;
    }

    public static boolean getNames(String name){
        if (favoritos == null) {
            favoritos = new ArrayList<>();
        }
        for ( int i = 0; i< favoritos.size();i++){
            if(favoritos.get(i).getNombre() == name){
                return true;
            }
        }
        return false;
    }
}