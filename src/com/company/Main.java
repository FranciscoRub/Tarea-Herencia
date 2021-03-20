package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======LOCALES COMERCIALES=====");
        System.out.println("Local comercial Empresa MetroCorp: ");
        Localescomerciales METROCORP = new Localescomerciales("21 de marzo del 2010",202030,"AD Corp",1898123,"2 de septiembre del 2005","8 de octubre del 2009");
        METROCORP.informacion();

        System.out.println("\nLocal comercial Lavanderia Clean");
        Localescomerciales lavanderiaclean = new Localescomerciales("10 de febrero del 2018",304981,"Fernando Gonzales",1892132,"30 de Enero del 2018","4 de febrero del 2018");
        lavanderiaclean.informacion();
        System.out.println("\n\n=====DEPARTAMENTOS=====");
        System.out.println("\nInmoterra Department");
        Departamentos inmoterra = new Departamentos("29 de abril del 2016",239211,"Manuel Rodriguez",30123,4,5,"Wifi 24/7, Area Social con piscina y area de juegos, vista al mar");
        inmoterra.informacion();

        System.out.println("\nColibrí departamentos de lujo");
        Departamentos colibri = new Departamentos("12 de Julio ",8123213,"Banco Nacional",12312,2,3,"Elevador moderno, Muebles de lujo, Gimnasio abierto las 24 horas,bodega");
        colibri.informacion();

        System.out.println("\nEdificio 440D");
        Departamentos edificio = new Departamentos("15 de Agosto de 1995",39321,"Oscar Valdez",0440,1,1,"Cocina espaciosa con comedor y desayunador, bar, recepción,estacionamiento subterraneo");
        edificio.informacion();

        System.out.println("\n\n======Terrenos======");
        System.out.println("\nFinca ruta 64");
        Terrenos fincaruta = new Terrenos("24 de diciembre de 1967",1211,"Pablo Mendoza",12312,2400,"Ruta 64, Cartago, Costa Rica");
        fincaruta.informacion();

        System.out.println("\nRancho los Olmos");
        Terrenos losolmos = new Terrenos("30 de noviembre del 2015", 81823,"Banco XYZ",988123,7383,"David,Chiriquí, Panamá");
        losolmos.informacion();

        System.out.println("\nPlaya estrella");
        Terrenos estrella = new Terrenos("25 de mayo del 2002",94321,"Eduardo Cervantes",84311,12231,"Bocas del Toro,Panamá");
          estrella.informacion();

        System.out.println("\nVista Alegre");
        Terrenos vistaalegre = new Terrenos("7 de septiembre del 2008",12312,"Expropiedad del Gobierno",129311,34989,"Medellín,Antoquia,Colombia");
        vistaalegre.informacion();

        System.out.println("\nEl Roble");
        Terrenos elroble = new Terrenos("12 de Marzo",129321,"Pedro Zapata",394123,4339,"Penonomé,Cocle,Panamá");
        elroble.informacion();


    }
}
