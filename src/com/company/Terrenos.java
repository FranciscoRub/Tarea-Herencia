package com.company;

public class Terrenos extends Inmuebles {

    //atributos especificos
    private int metroscuadrados;
    private String ubicación;

    public Terrenos(String fechadeadquisicion, long lote, String ultdueños, long numregistro, int metroscuadrados, String ubicación) {
        super(fechadeadquisicion, lote, ultdueños, numregistro);
        this.metroscuadrados = metroscuadrados;
        this.ubicación = ubicación;
    }

    public void informacion() {
        System.out.println("Fecha de adquisición: " + getFechadeadquisicion() +
                "\nNúmero de lote: " + getLote() +
                "\nÚltimo dueño: " + getUltdueños() +
                "\nNúmero de registro: " + getNumregistro() +
                "\nNúmero de metros cuadrados:" + metroscuadrados +
                "\nubicación: " + ubicación);
    }
}