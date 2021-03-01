/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

/**
 *
 * @author ALEW
 */
public class TestPArk {
    public static void main(String[] args) {
        Park a = new Park("A",200,true,true,false,false);
        System.out.println(a.getNombre());
        System.out.println(a.getUbicacion());
        System.out.println(a.getPicnic());
        System.out.println(a.getTennis());
        System.out.println(a.getPatio());
        System.out.println(a.getPiscina());
    }
}
