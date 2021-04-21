/*1.- Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar,
7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras, 10 …, 21 Dormir, leer un valor de
1  al 24 validar e imprimir la acción que realiza en su horario.*/

package actividad.pkg2.e1;
import java.util.Scanner;

public class ACTIVIDAD2E1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println( "HORARIO DE MIERCOLES");
        System.out.println( "Introduce una hora:");
        int hora= entrada.nextInt();
        
        switch(hora){
            case 24,1,2,3,4,5,6:
                System.out.println( "Dormir");
                break;
            case 7:
                System.out.println( "Despertar");
                break;
            case 8:
                System.out.println( "Desayunar");
                break;
            case 9,10:
                System.out.println( "Clase de calculo integral");
                break;
            case 11,12:
                System.out.println( "Clase de algebra lineal");
                break;
            case 13,14:
                System.out.println( "Clase de ingles");
                break;
            case 15:
                System.out.println( "Almorzar");
                break;
            case 16,17,18:
                System.out.println( "Hacer tarea");
                break;
            case 19,20:
                System.out.println( "Clase de lenguaje de programación");
                break;
            case 21:
                System.out.println( "Jugar videojuegos");
                break; 
            case 22:
                System.out.println( "Cenar");
                break;
            case 23:
                System.out.println( "Ultimas tareas pendientes");
                break;
            default:
                System.out.println( "Hora incorrecta");
            
            }
        
                
        }
        
    }
   
