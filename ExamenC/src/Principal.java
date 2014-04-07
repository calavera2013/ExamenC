import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a, b;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		a = leer.nextInt();
		// leer segundo numero
		b = leer.nextInt();
		
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +sumar(a,b) );
		
		// dividir
		// ...

	}
	
	public static int  sumar(int a, int b){
		int resultado = 0;
		resultado = a + b;
		return resultado;
	}
	
	public static int  dividir(int a, int b){
		int resultado = 0;
		resultado = a / b;
		return resultado;
	}

}
