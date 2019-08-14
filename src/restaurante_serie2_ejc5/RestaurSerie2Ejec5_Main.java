package restaurante_serie2_ejc5;

import java.util.Scanner;

public class RestaurSerie2Ejec5_Main {

    public static void main(String args[]) {

        int tipoPlato = 5, continuar = 1;

        Scanner entrada = new Scanner(System.in);

        do {
            RestaurSerie2Ejec5_Menu menu = new RestaurSerie2Ejec5_Menu();
             
            System.out.println("Para comida Vegetariana presiona 1, No Vegetariana presiona 2, Rapida presiona 3 ");
            tipoPlato = entrada.nextInt();
           
            switch (tipoPlato) {

                case 1: menu.Vegetariana();
                    break;
                    
                case 2:
                    menu.NoVegetariana();
                    break;

                case 3:
                      menu.Rapida();
                    break;

                default:System.out.println("");
                    System.out.println(" ** Tu seleccion no esta dentro del rango de 1 a 3, por favor intenta nuevamente ** ");
                    System.out.println("");
                    break;

            }
            System.out.println("presione 1 para nueva orden o presione otro numero para terminar");
            continuar = entrada.nextInt();
        } while (continuar == 1);
        System.out.println("----------------------------------------");
        System.out.println("Gracias por tu compra. Vuelve Pronto :) ");
        System.out.println("----------------------------------------");
    }

}
