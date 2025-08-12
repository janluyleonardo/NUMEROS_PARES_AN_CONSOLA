/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares1n;

import java.util.Scanner;

/**
 *
 * @author Yeferson Chaparro
 */
public class Numerospares1n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        INTERFAZ in = new INTERFAZ();
//        in.setVisible(true);
//        in.setLocationRelativeTo(null);
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingresar numero final ");
        int num1 = objeto.nextInt();

        System.out.println("numeros pares");
        for (int i = 1; i <= num1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
