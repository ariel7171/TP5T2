/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Melina
 */
@RunWith(value=Parameterized.class)
public class dolaritosTest {
    static Conversor instance;
    static float expResult;
    static float dolaresIng;
    
    
    public dolaritosTest(float dolaresIngresados, float resultadoEsperado) {
        this.instance = new Conversor();
        this.dolaresIng = dolaresIngresados;
        this.expResult = resultadoEsperado;
    }
    
    @Before
    public void saldoDolares(){
        System.out.println("Before");
        instance.setSaldoDolares(100);
    }
    
    @Parameters
    public static Iterable<Object[]> tomarDatos(){
        return Arrays.asList(new Object[][]{{180000, 180100},{1500,1600},{120, 220},{111.11f,211.11f}});
    }
    
    @Test
    public void testCotizarCero(){
        System.out.println("TestCotizarCero");
        instance.aumentarSaldoenDolares(dolaresIng);
        assertEquals(expResult, instance.getSaldoDolares(), 0.0002);
    }
    
 
    
    
   
}
