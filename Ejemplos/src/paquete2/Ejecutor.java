/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Vehiculo;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa
        Edificio edi1 = new Edificio("Edificio Central");
        edi1.establecerCostos(50.0);
        Edificio edi2 = new Edificio("Edificio Norte");
        edi2.establecerCostos(45.0);
        Edificio edi3 = new Edificio("Edificio Sur");
        edi3.establecerCostos(85.0);
        Edificio edi4 = new Edificio("Edificio Oeste");
        edi4.establecerCostos(90.0);
        Edificio[] arreglo1 = {edi1, edi2, edi3, edi4};
        
        Vehiculo veh1 = new Vehiculo("Moto", "LBA231", 20);
        Vehiculo veh2 = new Vehiculo("Todo Terreno", "LBB232", 10);
        Vehiculo veh3 = new Vehiculo("Cuadron", "LCA233", 5);
        Vehiculo veh4 = new Vehiculo("Automatico", "LJA433", 20);
        
        Vehiculo [] listaVehiculos = {veh1,veh2,veh3,veh4};
        
        Empresa emp1 = new Empresa();
        emp1.establecerNombre("LA PODEROSA");
        emp1.establecerEdificios(arreglo1);
        emp1.calcularCostoInmueble();
        emp1.establecerVehiculos(listaVehiculos);
        emp1.calcularCostoVehiculos();
        emp1.calcularCostoFinal();
        
        System.out.printf("%s\n",emp1);

    }
}
