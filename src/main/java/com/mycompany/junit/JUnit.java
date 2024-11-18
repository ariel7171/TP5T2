/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.junit;

/**
 *
 * @author Melina
 */
public class JUnit {

    public static void main(String[] args) {
        Conversor test = new Conversor();
        
        System.out.println(test.calcularCotizacion(1800000, 1620));
        System.out.println(test.calcularCotizacion(1200, 1));
    }
}
