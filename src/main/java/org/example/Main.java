package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Se declaran las variables

        String nombreCliente;
        String apellidoCliente;
        String dniCliente;
        Integer edadCliente;
        String ciudadCliente;
        Integer numeroBoletas;
        Double costoTotal;

        System.out.println("BIENVENIDO A TUBOTELA");
        System.out.println("🎤🎤🎤🎤🎤🎤🎤🎤🎤");
        // Se inicializan las variables
        System.out.println("Señor usuario digite por favor los siguientes datos✏✏✏");
        System.out.println("🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒🗒");
        System.out.println("Señor usuario por favor tenga en cuenta que debes tener la mayoria de edad para este evento y que puedes comprar maximo 4 boletas.");
        System.out.println("Agradecemos su comprension");

        System.out.print("Digite su nombre: ");
        nombreCliente = keyboard.nextLine();

        System.out.print("Digite sus apellidos: ");
        apellidoCliente = keyboard.nextLine();

        System.out.print("Digite su cédula: ");
        dniCliente = keyboard.nextLine();

        System.out.print("Digite su edad: ");
        edadCliente = keyboard.nextInt();

        System.out.print("Digite su ciudad: ");
        ciudadCliente = keyboard.nextLine();
        keyboard.nextLine();

        System.out.print("Digite el numero de boletas que desea comprar, recuerda que son maximo 4: ");
        numeroBoletas = keyboard.nextInt();

        // Proceso

        if (numeroBoletas < 0 || numeroBoletas > 4) {
            System.out.println("Señor usuario te recordamos que solo es posible comprar de 1 a 4 boletas.");
        } else if (edadCliente < 18) {
            System.out.println("Señor usuario lo sentimos, para este evento es indispensable ser mayor de edad.");
        } else {
            costoTotal = numeroBoletas * 450000.00;
            System.out.println("Apreciado usuario " + nombreCliente + " " + apellidoCliente + ", el costo total de las boletas es por un valor de: $" + costoTotal + " las cuales han sido para la ciudad de " + ciudadCliente + ".");
        }
    }
}