import java.util.Scanner;

public class condicional {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int numero;
	
	System.out.println("Ingrese numero: ");
	numero = sc.nextInt();
	
	//Empieza condicional
	
	if(numero > 10){
	    System.out.println("Mayor que 10");
	     } else {
	    System.out.println("Menor o igual que 10");
	    }
	
	}
}
