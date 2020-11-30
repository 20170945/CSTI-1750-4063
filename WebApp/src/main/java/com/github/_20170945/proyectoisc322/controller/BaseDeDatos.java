package com.github._20170945.proyectoisc322.controller;

public class BaseDeDatos {
    private static BaseDeDatos instance = null;

    public static BaseDeDatos getInstance() {
        if(instance==null) {
            instance = new BaseDeDatos();
        }
        return instance;
    }

}
