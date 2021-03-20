package com.company;

public class Localescomerciales extends Inmuebles {

    //atributos
private String fechaConstruccion;
private String fechainspeccion;


//constructor
public Localescomerciales(String fechadeadquisicion,long lote,String ultdueños, long numregistro,String fechaConstruccion,String fechainspeccion){
    super(fechadeadquisicion,lote,ultdueños,numregistro);
    this.fechaConstruccion=fechaConstruccion;
    this.fechainspeccion=fechainspeccion;
}
public void informacion(){
    System.out.println("Fecha de adquisición: "+getFechadeadquisicion()+
            "\nNúmero de lote: "+getLote()+
            "\nÚltimo dueño: "+getUltdueños()+
            "\nNúmero de registro: "+getNumregistro()+
            "\nfecha de Construcción: "+fechaConstruccion+
            "\nfecha de inspección:"+fechainspeccion);



}
}