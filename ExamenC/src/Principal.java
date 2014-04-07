import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a = 0, b = 0;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		System.out.println("Introduzca el primer numero");
		a=leer.nextInt();
		
		// leer segundo numero
		System.out.println("Introduzca el segundo numero");
		b=leer.nextInt();
		
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +sumar(a,b) );
		
		// dividir
		// ...
		System.out.println( "La division de " + a + " y " + b + " es " +dividir(a,b)  );
	}

	private static int sumar(int a, int b) {
		
		return a+b;
	}
	private static int dividir(int a, int b){
		return a/b;
	}

}
