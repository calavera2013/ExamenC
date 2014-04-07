import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a, b;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		try{
		int a = Integer.parseInt(leer.nextLine());
		}catch(Exception e){
			System.out.println("Error debe introducir un numero entero para poder realizar las operaciones");
		}
		// leer segundo numero
		try{
		int b = Integer.parseInt(leer.nextLine());
		}catch(Exception e){
			System.out.println("Error debe introducir un numero entero para poder realizar las operaciones");
		}
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +sumar(a,b) );
		
		public static int sumar(int a, int b){
			return a+b;
		}
		// dividir
		System.out.println("La division de " + a + " y " + b + " es " +dividir(a,b));
		// ...
		public static int dividir(int a, int b){
			return a/b;
		}
	}

}
