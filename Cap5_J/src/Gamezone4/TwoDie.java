/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone4;

/**
 *
 * @author ALEW
 */
public class TwoDie {
    public static void main(String[] args) {
        Die dado1 = new Die();
        Die dado2 = new Die();

        if (dado1.getvalor() == dado2.getvalor()){
            System.out.println("Empate");
        }else if (dado1.getvalor() > dado2.getvalor()){
            System.out.println("Dado 1 es mas grande");
        }else{
            System.out.println("Dado 2 es mas grnade");
        }
    }
}
