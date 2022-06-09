/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String n,String m, double v) {
        tipo = n; 
        matricula = m; 
        valor = v; 
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public void establecerMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double valor) {
        this.valor = valor;
    }
     @Override
    public String toString() {
        String cadena = String.format("Vehiculo de Tipo: %s\n"
                + "Vehiculo con Costo: %s\n"
                + "Vehiculo con Matricula: %.2f\n",
                tipo,matricula,valor); 
        return cadena;
    }

}
