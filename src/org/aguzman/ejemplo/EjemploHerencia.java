package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        //Persona alumno = new Alumno();
        Alumno alumno = new Alumno();
        //alumno.nombre = "Andres";
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setInstitucion("instituto nacional");
        //((Alumno)alumno).setInstitucion("instituto nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + ((Alumno)alumno).getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());
    }
}
