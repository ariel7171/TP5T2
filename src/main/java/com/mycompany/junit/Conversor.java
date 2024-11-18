/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.junit;

/**
 *
 * @author Melina
 */
public class Conversor {
    private float saldoPesos;
    private float saldoDolares;

    public Conversor(float saldoPesos, float saldoDolares) {
        this.saldoPesos = saldoPesos;
        this.saldoDolares = saldoDolares;
    }
    
    public Conversor() {
        this.saldoPesos = 0;
        this.saldoDolares = 0;
    }

    public float getSaldoPesos() {
        return saldoPesos;
    }

    public void setSaldoPesos(float saldoPesos) {
        this.saldoPesos = saldoPesos;
    }

    public float getSaldoDolares() {
        return saldoDolares;
    }

    public void setSaldoDolares(float saldoDolares) {
        this.saldoDolares = saldoDolares;
    }
    
    public float convertirPesosADolares(float pesos, float cotizacion){
        return Math.round((pesos / cotizacion)*100.0f)/100.0f;
        
    }
    
    public float convertirDolaresAPesos(float dolares, float cotizacion){
        return Math.round((dolares * cotizacion)*100.0f)/100.0f;
    }
    
    public float calcularCotizacion(float pesos, float dolares){
        return Math.round((pesos / dolares)*100.0f)/100.0f;
    }
    
    public void aumentarSaldoenPesos(float pesos){
        this.saldoPesos += Math.round(pesos*100.0f)/100.0f;
    }
    
    public void aumentarSaldoenDolares(float dolares){
        this.saldoDolares += Math.round(dolares*100.0f)/100.0f;
    }
    
    public void retirarDolares(float dolares){
        if (dolares<=this.saldoDolares){
            this.saldoDolares -= dolares;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void retirarPesos(float pesos){
        if (pesos<=this.saldoPesos){
            this.saldoPesos -= pesos;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
