package org.example;

import java.util.*;
import java.util.stream.Collectors;

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

        System.out.println("------------------------------------- CASO PRÁCTICO 1 -------------------------------------");


        List<String> streamAlumnos = alumnos.stream()
                .filter(a -> a.getNota()>=7)
                .map(a -> a.getNombre())
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Alumnos con nota mayor a 7, ordenados: ");
        System.out.println(streamAlumnos);

        OptionalDouble promedioOpcional = alumnos.stream()
                .mapToInt(a -> a.getNota())
                .average();

        double promedioGeneral = promedioOpcional.orElse(0.0);
        System.out.println("Promedio General de notas: "+ promedioGeneral);

        Map<String, List<Alumno>> alumPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(a -> a.getCurso()));

        System.out.println("Alumnos Ordenador por curso: "+alumPorCurso);

        List<Alumno> mejoresAlum = alumnos.stream()
                .sorted(Comparator.comparing(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Mejores alumnos: "+ mejoresAlum);

        System.out.println("------------------------------------- CASO PRÁCTICO 2 -------------------------------------");
    }
}