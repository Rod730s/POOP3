/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
/**
 *
 * @author rodri_001
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nums []; //forma 1
        int[] nums2 = {1,2,3,4,5}; //forma 2
        int [] nums3 = new int[5]; //forma 3
        int [] nums4; //forma 4
        nums4 = new int[5]; //forma 5
        
        System.out.println("########## for each ##########");
        for (int temp : nums2) {
            System.out.println("Cuenta "+ temp);
        }
        
        System.out.println("########## for ##########");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i*10;
        }
        
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        
        System.out.println("########## String ##########");
        String cadena = new String("Hola mundo"); //forma 1
        System.out.println(cadena);
        String cadena1 = "Hola mundo de forma recomendada"; //forma 2
        System.out.println(cadena1);
        
        String nombre = "Rodrigo";
        String apellido = "Ceron";
        System.out.println(nombre);//forma 1
        System.out.println(apellido);
        System.out.println(nombre + " " +apellido);//forma 2
        String nombreCompleto = nombre+" "+apellido;//forma 3
        System.out.println(nombreCompleto);
        
        System.out.println("########## Wrapper ##########");
        int a = 4;
        Integer b = new Integer(4); //forma 1 no recomendada
        System.out.println(b);
        Integer c = 4; //forma 2
        System.out.println(c);
        Integer d = a;
        String cadena3 = d.toString(); //forma 1
        System.out.println(cadena3);
        String cadena4 = 4 + ""; //forma 2
        System.out.println(cadena4);
        
        System.out.println("########## Colecciones ##########");
        System.out.println("########## ArraysList ##########");
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());
        
        System.out.println("*");
        for (Integer temp : miArrayList) {
            System.out.println( temp);
        }
        
        miArrayList.add(77);
        System.out.println("*");
        for (Integer temp : miArrayList) {
            System.out.println( temp);
        }
        System.out.println("Nuevo tamaño: " + miArrayList.size());
        
        System.out.println("########## Hashtable ##########");
        Hashtable<Integer,String> miTabla = new Hashtable<Integer,String>();
        miTabla.put(1,"uno");
        miTabla.put(434343323,  "Derek");
        miTabla.put(5125152,  "Lili");
        System.out.println("Elementos en tabla: " +miTabla.size());
        
        System.out.println("########## Enumerador ##########");
        Integer llave;
        String valor;
        
        Enumeration<Integer> enumeradorLlaves = miTabla.keys();
        while (enumeradorLlaves.hasMoreElements()) {
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
        
             
}
    }
    
    }
