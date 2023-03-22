/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g3.ej01.paroimpar;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class G3Ej01ParOimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un programa que dado un número determine si es par o impar.
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num=leer.nextInt();
        
        if (num%2==0) {
            System.out.println("el numero es par");
           }
        else {
            System.out.println("el numero es impar");
        }
    }
    
}
