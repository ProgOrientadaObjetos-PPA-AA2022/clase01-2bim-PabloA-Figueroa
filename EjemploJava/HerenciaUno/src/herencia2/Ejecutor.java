/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        EstudiantePresencial eP1 = new EstudiantePresencial(); 
        eP1.establecerNombresEstudiante("Pablito Calvito");
        eP1.establecerApellidoEstudiante("Un Peladito");
        eP1.establecerIdentificacionEstudiante("1106068933");
        eP1.establecerEdadEstudiante(19);
        eP1.establecerNumeroCreditos(45);
        eP1.establecerCostoCredito(256.65);
        eP1.calcularMatriculaPresencial();

        
        System.out.printf("Nombres: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Creditos: %d\n"
                + "Costo Credito %.2f\n"
                + "Costo Matricula %.2f\n",
                eP1.obtenerNombresEstudiante(),
                eP1.obtenerApellidoEstudiante(),
                eP1.obtenerIdentificacionEstudiante(),
                eP1.obtenerEdadEstudiante(),
                eP1.obtenerNumeroCreditos(),
                eP1.obtenerCostoCredito(),
                eP1.obtenerMatriculaPresencial());
    }
}
