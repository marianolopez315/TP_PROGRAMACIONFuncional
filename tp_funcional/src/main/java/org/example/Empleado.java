package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Empleado {

    private String nombre;
    private String departamento;
    private double salario;
    private int edad;
}
