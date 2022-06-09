/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos; 
    private double costoTotalInmuebles;     

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }
    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public void calcularCostoInmueble() {
        double suma = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    public void calcularCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    public void calcularCostoFinal() {
        costoTotalInmuebles = costoBienesInmuebles + costoVehiculos;
    }

    public double obtenerCostoVehiculo() {
        return costoBienesInmuebles;
    }
    public double obtenerCostoInmueble() {
        return costoVehiculos;
    }
    public double obtenerCostoFinal() {
        return costoTotalInmuebles;
    }


    @Override
    public String toString() {
        String cadena = "Empresa de Hojas\nLista de Edificios\n";
        for (int i = 0; i < obtenerEdificios().length; i++) {
            cadena = String.format("%s%d. %s"
                    + " (%.2f)\n", cadena, i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%sTotal De Inmuebles: %.2f\n\n", cadena, obtenerCostoInmueble());
        cadena = String.format("%sLista de Vehiculos: \n", cadena);
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            cadena = String.format("%s%d. %s, %s"
                    + " (%.2f)\n", cadena, i + 1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }
        cadena = String.format("%sTotal De Vehiculos: %.2f\n\n", cadena, obtenerCostoVehiculo());
        cadena = String.format("%sTotal De Bienes: %.2f", cadena, obtenerCostoFinal());
        return cadena;
    }
}
