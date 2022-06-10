/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        EstudianteDistancia ed1 = new EstudianteDistancia(); 
        System.out.println("Ingrese el nombre del Estudiante");
        String nombre = entrada.nextLine();
        ed1.establecerNombresEstudiante(nombre);
        System.out.println("Ingrese los Apellidos del Estudiante");
        String apellidos = entrada.nextLine(); 
        ed1.establecerApellidoEstudiante(apellidos);
        System.out.println("Ingrese la identificacion del Estudiante");
        String identificacion = entrada.nextLine(); 
        ed1.establecerIdentificacionEstudiante(identificacion);
        System.out.println("Ingrese la edad del Estudiante");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        ed1.establecerEdadEstudiante(edad);
        System.out.println("Ingrese el numero de Asignaturas");
        int nAsignaturas = entrada.nextInt(); 
        ed1.establecerNumeroAsginaturas(nAsignaturas);
        System.out.println("Ingrese el costo de Adignatura");
        double cAsignatura = entrada.nextDouble(); 
        ed1.establecerCostoAsignatura(cAsignatura);
        ed1.calcularMatriculaDistancia();
        
        System.out.printf("%s \n",ed1 );
       /* System.out.printf("\nNombres: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Creditos: %d\n"
                + "Costo Creditos: %.2f\n"
                + "Costo Matricula: %.2f\n",
                ed1.obtenerNombresEstudiante(),
                ed1.obtenerApellidoEstudiante(),
                ed1.obtenerIdentificacionEstudiante(),
                ed1.obtenerEdadEstudiante(),
                ed1.obtenerNumeroAsignaturas(),
                ed1.obtenerCostoAsignatura(),
                ed1.obtenerMatriculaDistancia());*/
    }
}
