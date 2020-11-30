package com.github._20170945.proyectoisc322.controller;

public class Optica {
    private static Optica instance;

    public static Optica getInstance() {
        if(instance==null)
            instance = new Optica();
        return instance;
    }
}
