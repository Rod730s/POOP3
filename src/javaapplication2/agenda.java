/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Hashtable;
import java.util.Scanner;

/**

 * @author rodri_001
 */
class agenda {
    
public class AgendaCumpleaños {

    public static void main(String[] args) {
        Hashtable<String, String> agenda = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la fecha de cumpleaños de " + nombre + " (dd/mm/yyyy): ");
            String fechaCumpleaños = scanner.nextLine();

            agenda.put(nombre, fechaCumpleaños);
        }

        System.out.println("\nAgenda de Cumpleaños:");
        for (String nombre : agenda.keySet()) {
            System.out.println("Nombre: " + nombre + ", Cumpleaños: " + agenda.get(nombre));
        }

        scanner.close();
    }
}
}
