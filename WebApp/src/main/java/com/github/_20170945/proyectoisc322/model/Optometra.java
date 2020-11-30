package com.github._20170945.proyectoisc322.model;

import java.util.ArrayList;
import java.util.Date;

public class Optometra extends Usuario {
    private int horasLaborables;
    private ArrayList<String> diasLaborales;
    private Date horaInicio;
    private Date horaFin;
    private ArrayList<Cita> citasCola;
}
