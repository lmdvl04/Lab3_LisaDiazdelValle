/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_lisadiazdelvalle;

import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class Lab3_LisaDiazdelValle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("--Menu--");
            System.out.println("1. Diptongo");
            System.out.println("2. Sumatoria PI");
            System.out.println("3. Time Clock");
            System.out.println("4. Salir ");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    String palabra;
                    System.out.println("--Diptongo--");
                    System.out.println("Ingrese una palabra: ");
                    palabra = leer.next().toLowerCase();
                    int contador = 0, total = 0;
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.charAt(i);
                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u': 
                                contador++;
                                break;
                        }
                        if(contador == 1){
                            if((i + 1)< palabra.length()){
                                for (int x = i +1; x<= i+1; x++){
                                    char letra2 = palabra.charAt(x);
                                    switch (letra2) {
                                        case 'a':
                                        case 'e':
                                        case 'i':
                                        case 'o':
                                        case 'u': 
                                            contador++;
                                            break;
                                    }
                                }
                            }
                        }
                        if (contador == 2){
                            total++;
                        }
                    }
                    if (total >= 1){
                        System.out.println("Resultado: La palabra " +palabra+" es diptongo");                      
                    }
                    else{
                        System.out.println("Resultado: La palabra " +palabra+" no es diptongo");  
                    }//fin de caso 1           
                    break;
                case 2:
                    int lim;
                    double x,y, result, acumulador = 0;
                    System.out.println("--Sumatoria PI--");
                    System.out.println("Ingrese un numero limite: ");
                    lim = leer.nextInt();
                    
                    if(lim > 0){
                    for (int i = 0; i< lim; i++){
                        x = Math.pow(-1,i);
                        y = (2*i) + 1;
                        result = x/y;
                        acumulador = acumulador + result;
                    }//for
                    acumulador = acumulador * 4;
                    System.out.println("Resultado: "+acumulador);
                    }//if
                else{
                    System.out.println ("Debe ingresar un numero entero positivo") ;  
                    }                   
                    break;//fin caso 2
                case 3:
                    int num;
                    System.out.println("--Time clock--");
                    System.out.println("Ingrese un tamano impar: ");
                    num = leer.nextInt();

                    if (num % 2 == 0) {
                        System.out.println("Debe ingresar un numero impar");
                    } else {
                        num = num +1;
                        num = num/2;
                        for (int i = 0; i < num; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = num - i; j > 0; j--) {
                                System.out.print(" *");
                            }
                            System.out.println();
                        }
                        for (int i = 2; i <= num; i++) {
                            for (int j = num - i; j > 0; j--) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print(" *");
                            }
                            System.out.println();
                        }
                    }
                    break;//fin caso 3

            }//switch

        } while (opcion != 4);
    }//fin del main
}//fin del class
