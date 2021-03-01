/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rental> renta = new ArrayList<>();

        for (int i = 0; i <1 ; i++) {
            System.out.println("Contrato");
            String x =  sc.nextLine();

            System.out.println("Numero de minutos");
            int y = sc.nextInt();

            renta.add(new Rental(x,y));

        }

        for (int i = 0; i <renta.size() ; i++) {
            System.out.println(renta.get(i).getContrato());
            System.out.println(renta.get(i).getMinutos());

        }
    }
}
