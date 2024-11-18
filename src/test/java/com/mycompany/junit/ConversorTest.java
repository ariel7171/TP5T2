/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


/**
 *
 * @author Melina
 */
public class ConversorTest {
    
    private static Conversor conversion1; //= new Conversor(500, 500);;
    
    public ConversorTest() {
    }
    
    @BeforeClass
    public static void inicio(){
        conversion1 = new Conversor(500, 500);
        System.out.println("Welcome to the jungle!!");
    }
    
    @Before
    public void Before(){
        System.out.println("Before()");
    }
    
    
    @Test
    public void test1(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        
        conversion1.retirarDolares(200);
        assertEquals(299.999, conversion1.getSaldoDolares(), 0.001);
    }
    
    @Test
    public void test2(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        
        
        
        conversion1.retirarPesos(200);
        assertEquals(299.999, conversion1.getSaldoPesos(), 0.001);
    }
    
    @After
    public void after(){
        System.out.println("Prueba Finalizada!, campos en 0");
    }
    
    @AfterClass
    public static void afterClass(){
        System.out.println("La operacion a finalizado!");
    }
    
    
    /*
    @Before antes de cada método, que muestre un mensaje de la operación que se testea
    Use System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    */

    /**
     * Test of getSaldoPesos method, of class Conversor.
     */
    
    
    
  
    
}
