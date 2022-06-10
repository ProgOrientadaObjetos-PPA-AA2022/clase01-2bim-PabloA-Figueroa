/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        EstudianteDistancia ed1 = new EstudianteDistancia();
        EstudiantePresencial ep1 = new EstudiantePresencial();
        System.out.println("Ingrese 1 para ingresar un Estudiante a Distancia");
        System.out.println("Ingrese 2 para ingresar un Estudiante Presencial");
        int condicion = entrada.nextInt();
        if (condicion != 1 && condicion != 2) {
            System.out.println("Valores Fuera de Rango");
        } else {
            entrada.nextLine();
            System.out.println("Ingresar Valores");
            System.out.println("Ingrese el nombre del Estudiante");
            String nombre = entrada.nextLine();
            ep1.establecerNombresEstudiante(nombre);
            System.out.println("Ingrese los Apellidos del Estudiante");
            String apellidos = entrada.nextLine();
            ep1.establecerApellidoEstudiante(apellidos);
            System.out.println("Ingrese la identificacion del Estudiante");
            String identificacion = entrada.nextLine();
            ep1.establecerIdentificacionEstudiante(identificacion);
            System.out.println("Ingrese la edad del Estudiante");
            int edad = entrada.nextInt();
            ep1.establecerEdadEstudiante(edad);
            
            if (condicion == 1) {
                entrada.nextLine();
                System.out.println("Ingrese el numero de Asignaturas");
                int nAsignaturas = entrada.nextInt();
                ed1.establecerNumeroAsginaturas(nAsignaturas);
                System.out.println("Ingrese el costo de Adignatura");
                double cAsignatura = entrada.nextDouble();
                ed1.establecerCostoAsignatura(cAsignatura);
                ed1.calcularMatriculaDistancia();
                System.out.printf("%s \n", ed1);

            } else if (condicion == 2) {
                entrada.nextLine();
                System.out.println("Ingrese el numero de Creditos");
                int nAsignaturas = entrada.nextInt();
                ep1.establecerNumeroCreditos(nAsignaturas);
                System.out.println("Ingrese el costo de Credito");
                double cAsignatura = entrada.nextDouble();
                ep1.establecerCostoCredito(cAsignatura);
                ep1.calcularMatriculaPresencial();
                System.out.printf("%s \n", ep1);
            }
        }
    }

}
