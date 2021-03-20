package com.company;

public class Departamentos extends Inmuebles {

    //atributos especificos
    private int habitaciones;
    private int baños;
    private String amenidades;

    public Departamentos(String fechadeadquisicion, long lote, String ultdueños, long numregistro, int habitaciones, int baños, String amenidades) {
        super(fechadeadquisicion, lote, ultdueños, numregistro);
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.amenidades = amenidades;
    }

    public void informacion() {
        System.out.println("Fecha de adquisición: " + getFechadeadquisicion() +
                "\nNúmero de lote: " + getLote() +
                "\nÚltimo dueño: " + getUltdueños() +
                "\nNúmero de registro: " + getNumregistro() +
                "\nhabitaciones: " + habitaciones +
                "\nbaños: " + baños +
                "\namenidades: " + amenidades);
    }
}
