package com.example.sets.service;

import com.example.sets.models.alumno;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class servicio {

    public Set<alumno> initiateAlumnos() {
        Set<alumno> estudiantes = new HashSet<>() ;
        alumno a1=new alumno("Gyo", "Cav", "Mar");
        alumno a2=new alumno("Eri", "Cav", "Woo");
        alumno a3=new alumno("Axl", "Cav", "Mal");
        alumno a4=new alumno("Sammy", "Cav", "Mal");
        alumno a5=new alumno("Wiggy", "Cav", "Mar");

        estudiantes.add(a1);
        estudiantes.add(a2);
        estudiantes.add(a3);
        estudiantes.add(a4);
        estudiantes.add(a5);

        return estudiantes;
    }
}
