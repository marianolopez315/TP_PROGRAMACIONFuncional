package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Juan", 8, "2k7");
        Alumno alumno2 = new Alumno("Amelia", 9, "3k10");
        Alumno alumno3 = new Alumno("Lucas", 6, "1k3");
        Alumno alumno4 = new Alumno("Ana", 4, "2k7");
        Alumno alumno5 = new Alumno("Pedro", 10, "1k3");


        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);


        List<String> streamAlumnos = alumnos.stream()
                .filter(a -> a.getNota()>=7)
                .map(a -> a.getNombre())
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(streamAlumnos);


    }
}