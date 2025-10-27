package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;
}
