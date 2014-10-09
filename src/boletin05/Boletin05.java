/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin05;

/**
 *
 * @author bhernandezsouto
 */
public class Boletin05 {
    public static void main(String[] args) {
        PasoPorValor op = new PasoPorValor();
        int x=4;
        System.out.println("valor del principio x: " + x);
        op.mudarDatoValor(x);
        System.out.println("valor de x: " + x);
        
    }
    
}
