import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a, b;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		try{
		int a1 = Integer.parseInt(leer.nextLine());
		}catch(Exception e){
			System.out.println("Error debe introducir un numero entero para poder realizar las operaciones");
		}
		// leer segundo numero
		try{
		int b1 = Integer.parseInt(leer.nextLine());
		}catch(Exception e){
			System.out.println("Error debe introducir un numero entero para poder realizar las operaciones");
		}
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +sumar(a,b) );
		
	
	}

	private static int dividir(int a, int b) {
		
		return a/b;
	}

	private static int sumar(int a, int b) {
		
		return a+b;
	}

}
