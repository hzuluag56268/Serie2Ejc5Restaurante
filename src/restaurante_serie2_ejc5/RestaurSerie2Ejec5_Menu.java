package restaurante_serie2_ejc5;

import java.util.Scanner;

public class RestaurSerie2Ejec5_Menu {

    private int tipo, cantidad, precioConIva, descuento, precioConDescuento;

    private String platoComida = "";

    Scanner entrada = new Scanner(System.in);

    public RestaurSerie2Ejec5_Menu() {
        
    }

    public void Vegetariana() {
        System.out.println("Seleccionaste comida  Vegetariana");
        System.out.print("Escribe si quieres  - Sopa de Vegetales - o - Ensaladas - o - Jugos -  --- ");
        platoComida = entrada.nextLine();
        System.out.print(" Cuantos platos deseas?  --- ");
        cantidad = entrada.nextInt();

        if (platoComida.equalsIgnoreCase("Sopa de Vegetales")) {
            precioConIva = (cantidad * 10000) * 119 / 100;
            descuento = precioConIva * 20 / 100;
            precioConDescuento = precioConIva - descuento;

        } else if (platoComida.equalsIgnoreCase("Ensaladas")) {
            precioConIva = (cantidad * 25000) * 119 / 100;
            descuento = precioConIva * 20 / 100;
            precioConDescuento = precioConIva - descuento;
        } else if (platoComida.equalsIgnoreCase("Jugos")) {
            precioConIva = (cantidad * 5000) * 119 / 100;
            descuento = precioConIva * 20 / 100;
            precioConDescuento = precioConIva - descuento;    
        } else {

            descuento = 1;
        }
        if (descuento == 1) {
            System.out.println("Lo sentimos, tu seleccion " + "-- " + platoComida + " --" + " no se encuentra disponible");
        } else {
            System.out.println("***************************************************************************************************************************************");
            System.out.println(" Felicidades! Obtuviste un descuento del 20% por un valor de " + descuento +
                    " pesos. El valor total a pagar es de " + precioConDescuento + " pesos por "
                    + cantidad + " " + platoComida);
            System.out.println("***************************************************************************************************************************************");

        }
    }
    
    public void NoVegetariana() {
        System.out.println("Seleccionaste comida No Vegetariana");
        System.out.print("Escribe si quieres  -Bandeja de Carne - o -Bandeja de Pollo-   --- ");
        platoComida = entrada.nextLine();
        System.out.print(" Cuantos platos deseas?  --- ");
        cantidad = entrada.nextInt();

        if (platoComida.equalsIgnoreCase("Bandeja de Carne")) {
            precioConIva = (cantidad * 30000) * 119 / 100;
            descuento = precioConIva * 10 / 100;
            precioConDescuento = precioConIva - descuento;

        } else if (platoComida.equalsIgnoreCase("Bandeja de Pollo")) {
            precioConIva = (cantidad * 28000) * 119 / 100;
            descuento = precioConIva * 10 / 100;
            precioConDescuento = precioConIva - descuento;
        } else {

            descuento = 1;
        }
        if (descuento == 1) {
            System.out.println("Lo sentimos, tu seleccion " + "-- " + platoComida + " --" + " no se encuentra disponible");
        } else {
            System.out.println("***************************************************************************************************************************************");
            System.out.println(" Felicidades! Obtuviste un descuento del 10% por un valor de " + descuento +
                    " pesos. El valor total a pagar es de " + precioConDescuento + " pesos por "
                    + cantidad + " " + platoComida);
            System.out.println("***************************************************************************************************************************************");

        }
    }
    
    public void Rapida() {
        System.out.println("Seleccionaste comida Rapida");
        System.out.print("Escribe si quieres  -PerroCaliente- o -Hamburguesa-   --- ");
        platoComida = entrada.nextLine();
        System.out.print(" Cuantos quieres?  --- ");
        cantidad = entrada.nextInt();

        if (platoComida.equalsIgnoreCase("PerroCaliente")) {
            precioConIva = (cantidad * 5000) * 119 / 100;
            descuento = 0;
            precioConDescuento = precioConIva - descuento;

        } else if (platoComida.equalsIgnoreCase("Hamburguesa")) {
            precioConIva = (cantidad * 7000) * 119 / 100;
            descuento = 0;
            precioConDescuento = precioConIva - descuento;
        } else {

            descuento = 1;
        }
        if (descuento == 1) {
            System.out.println("Lo sentimos, tu seleccion " + "-- " + platoComida + " --" + "  no se encuentra disponible");
        } else {
            System.out.println("*******************************************************************");
            System.out.println("El valor total a pagar es de " + precioConDescuento + " pesos por "
                    + cantidad + " " + platoComida);
            System.out.println("*******************************************************************");

        }
    }

}
