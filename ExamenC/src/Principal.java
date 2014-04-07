import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a, b;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		a=leer.nextInt();
		// leer segundo numero
		b=leer.nextInt();
		
		int suma=a+b;
		int resta=a-b;
		int multiplicacion=a*b;
		int division=a/b;
				
		
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +suma );
		
		// restar
		System.out.println( "La resta de " + a + " y " + b + " es " +resta);
	
		//multiplicar
		System.out.println( "La multiplicacion de " + a + " y " + b + " es " +multiplicacion);
		
		//dividir
		System.out.println( "La division de " + a + " y " + b + " es " +division);

	}

}
