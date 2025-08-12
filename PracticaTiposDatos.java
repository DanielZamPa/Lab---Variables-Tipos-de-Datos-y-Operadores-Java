package Clase_Lunes;
import java.util.Scanner;

public class PracticaTiposDatos {
    public static void main(String[] args){
        //Actividad 1:

        // Crear una instancia de Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de promedios");
        // Pedir al usuario que ingrese un notas
        System.out.print("Ingrese sus primer nota: ");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();//Limpieza de buffer
        System.out.print("Ingrese sus segunda nota: ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();//Limpieza de buffer
        System.out.print("Ingrese sus tercer nota: ");
        double nota3 = scanner.nextDouble();
        scanner.nextLine();//Limpieza de buffer
        //Operacion del promedio de las notas
        double promedio = (nota1+nota2+nota3)/3;
        // Mostrar los datos ingresados
        System.out.println("Promedio Nota: "+ promedio);

        //Actividad 2:
        //Obtener datos del perfilscanner

        System.out.println("Ingrese sus datos del perfil.");

        //Pedir dato nombre
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        //Pedir dato edad
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        //Pedir dato nacionalidad
        System.out.println("Ingresa tu nacionalidad: ");
        String nacionalidad= scanner.nextLine();
        scanner.nextLine();//Limpieza de buffer

        //Pedir dato ocupacion
        System.out.println("Ingresa tu ocupación: ");
        String ocupacionPerfil = scanner.nextLine();

        //Pedir dato salario
        System.out.println("Ingresa tu salario: ");
        int salario = scanner.nextInt();
        scanner.nextLine();//Limpieza de buffer

        //Imprimir datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Ocupación: " + ocupacionPerfil);
        System.out.println("Salario: " + salario);

        //Cerrar scanner
        scanner.close();
    }
}
