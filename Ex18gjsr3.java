package ex18gjsr;

import java.util.Scanner;

/**
 *
 * @author Gonzalo José Salmerón Robles
 * 
 * 11/11/2020
 */
public class Ex18gjsr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numeroCompleto = in.nextInt();
        int j = 1;
        int primerNum = 0;
        int cantidadDigitos = 1;
        int numeroRecortado = numeroCompleto;
        while (numeroCompleto > 10){
            primerNum = numeroCompleto / 10;
            numeroCompleto = primerNum;
            cantidadDigitos++;
        }
        if (primerNum >= cantidadDigitos){
            System.out.println("El número recortado es " + numeroRecortado);
        } else{
            j = 0;
            int cantidad = cantidadDigitos - primerNum;
            while (j < cantidad){
                numeroRecortado = numeroRecortado / 10;
                j++;
            }
            System.out.println("El número recortado es " + numeroRecortado);
        } 
    }
}