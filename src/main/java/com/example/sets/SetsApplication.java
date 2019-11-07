package com.example.sets;

import com.example.sets.models.alumno;
import com.example.sets.service.servicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SetsApplication.class, args);
        Set<alumno> ser = new servicio().initiateAlumnos();
        alumno ass = new alumno("Gyo", "cav", "mar");
        List<alumno> lalumno = new ArrayList<>(ser);
        for (alumno est :lalumno) {
            if (est.getNombre().equals(ass.getNombre())){
                est.setNombre("El macho");
            }
        }

        Stream stream = ser.stream();

        stream.forEach(item->{
            try {

                System.out.println(item.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
