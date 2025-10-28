package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------- CASO PRÁCTICO 1 -------------------------------------");

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
                .filter(a -> a.getNota() >= 7)
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
        System.out.println("Promedio General de notas: " + promedioGeneral);

        Map<String, List<Alumno>> alumPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(a -> a.getCurso()));

        System.out.println("Alumnos Ordenador por curso: " + alumPorCurso);

        List<Alumno> mejoresAlum = alumnos.stream()
                .sorted(Comparator.comparing(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Mejores alumnos: " + mejoresAlum);

        System.out.println("------------------------------------- CASO PRÁCTICO 2 -------------------------------------");

        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto("Carne", "alimentos", 110, 10 );
        Producto producto2 = new Producto("Cortinas", "hogar", 30, 40 );
        Producto producto3 = new Producto("Arroz", "alimentos", 27, 20 );
        Producto producto4 = new Producto("Lapicera", "utiles", 10, 70 );

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        List<Producto> streamProductosCaros = productos.stream()
                .filter(p -> p.getPrecio()>100)
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .collect(Collectors.toList());

        System.out.println("Productos más caros: "+streamProductosCaros);

        Map<String, Integer> producPorCat = productos.stream()
                .collect(Collectors.groupingBy(p -> p.getCategoria(), Collectors.summingInt(p -> p.getStock())));

        System.out.println("Stock por categoria: "+producPorCat);

        String reporteDeProductos = productos.stream()
                .map(p -> p.getNombre()+ ":"+ p.getPrecio())
                .collect(Collectors.joining(";"));

        System.out.println("Reporte de productos: "+reporteDeProductos);

        OptionalDouble promedioGeneralOpt = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average();

        double promedioGeneralProd = promedioGeneralOpt.orElse(0.0);
        System.out.println("Promedio General: " + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));

        System.out.println("Promedio por Categoría: " + promedioPorCategoria);

        System.out.println("------------------------------------- CASO PRÁCTICO 3 -------------------------------------");

        List<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro("Mi Planta de Naranja Lima", "José Mauro de Vasconcelos",256, 150);
        Libro libro2 = new Libro("Es tan dificil volver a Itaca", "Esteban Valentino",150, 110);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez",410, 190);
        Libro libro4 = new Libro("Cronica de una muerte anunciada", "Gabriel Garcia Marquez",170, 270);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        List<String> streamLibrosLargos = libros.stream()
                .filter(l -> l.getPaginas()>300)
                .map(l -> l.getTitulo())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Libros con +300 paginas: "+streamLibrosLargos);

        OptionalDouble promedioGeneralOpLib = libros.stream()
                .mapToInt(Libro::getPaginas)
                .average();

        double promedioGeneralLib = promedioGeneralOpLib.orElse(0.0);

        System.out.println("Promedio de paginas de libros: "+promedioGeneralLib);

        Map<String, Long> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor, Collectors.counting()));

        System.out.println("Libros por autor: "+ librosPorAutor);

        Optional<Libro> libroMasCaroOpt = libros.stream()
                .max(Comparator.comparing(Libro::getPrecio));

        if (libroMasCaroOpt.isPresent()) {
            Libro libroMasCaro = libroMasCaroOpt.get();
            System.out.println("El libro más caro es: " + libroMasCaro);
        } else {
            System.out.println("No se encontraron libros en la lista.");
        }

    }

}