
import java.util.Scanner;

/**
 *1. Crear un algoritmo que calcule el salario semanal de un trabajador, teniendo en cuenta:
• Las primeras 40 horas se pagan a una tarifa fija.
• Las horas adicionales se pagan a una tarifa de tiempo y medio.
 * 
 */
public class Fundamentos_computacionales {


    public static void main(String[] args) {
        int n_horas , tarifahora = 10; 
        double sueldo = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        n_horas = tcl.nextInt();
        
        if (n_horas > 40){
            System.out.println("Su sueldo semanal es: " + calcularSueldoextra(n_horas, tarifahora, sueldo));
        }else{
        
            System.out.println("Su sueldo semanal es: " + calcularSueldoSemanal(n_horas, tarifahora, sueldo));
        }
    }
     public static double calcularSueldoextra(int n_horas,int tarifahora, double sueldo){
     
         sueldo = ((n_horas - 40)*(tarifahora * 1.5)) + 400;
         
         return sueldo;
     }
     
    public static double calcularSueldoSemanal(int n_horas,int tarifahora, double sueldo){
     
         sueldo = n_horas * tarifahora;
         
         return sueldo;
     }        

}
