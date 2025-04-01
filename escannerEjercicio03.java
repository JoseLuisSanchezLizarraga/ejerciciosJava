//escanner Ejercicio03

//importamos la libreria scanner

import java.util.Scanner;


public class escannerEjercicio03 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int numero1, numero2, resultado;
      
      System.out.println("Ingrese el primer numero: ");
      numero1 = sc.nextInt();
      
      System.out.println("Ingrese el segundo numero: ");
      numero2 = sc.nextInt();
      
      resultado = numero1 + numero2;
      
      System.out.println("El resultado es: " + resultado);
   
   }
}
