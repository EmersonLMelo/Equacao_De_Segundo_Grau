/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapapgll;

import java.util.Scanner;

/**
 *
 * @author Emerson Lidio Melo
 * RA - 21020130-5
 */
public class MapaPGll {

    public static void main(String[] args) {
        int a, b, c;
        double del, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de ‘a’: ");
        a = sc.nextInt();
        System.out.println("Informe o valor de ‘b’: ");
        b = sc.nextInt();
        System.out.println("Informe o valor de ‘c’: ");
        c = sc.nextInt();
        try {
            del = calcularDelta(a,b,c);
            x1 = (-b + Math.sqrt(del)) / (2 * a);
            x2 = (-b - Math.sqrt(del)) / (2 * a);
            System.out.println("O valor de delta é: " + del);
            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
         }
    }
    
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    }
}
