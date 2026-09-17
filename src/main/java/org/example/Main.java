package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFilaBanco banco = new GestionFilaBanco();
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;
        do{
            System.out.println("--------PANEL DE CONTROL DE CLIENTES--------");
            System.out.println("1. Registrar cliente:");
            System.out.println("2. Registrar cliente VIP:");
            System.out.println("3. Atender al siguiente cliente:");
            System.out.println("4. Salir del programa");

            try {
                String entrada = scanner.nextLine();
                opcion = Integer.parseInt(entrada.trim());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del cliente");
                        String nombre = scanner.nextLine();
                        banco.agregarClienteNormal(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del cliente VIP");
                        String nombrevip = scanner.nextLine();
                        banco.agregarClienteVIP(nombrevip);
                        break;
                    case 3:
                        banco.atenderSiguienteCliente();
                        break;
                    case 4:
                        System.out.println("saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            }catch (NumberFormatException e) {
                System.out.println("debe ingresar un numero entero");
            }
        } while(opcion != 4);
        scanner.close();
    }
}