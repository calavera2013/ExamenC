import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		int a, b;
		Scanner leer = new Scanner(System.in);
		
		// leer primer numero
		a = Integer.parseInt(leer.nextLine());
		// leer segundo numero
		b = Integer.parseInt(leer.nextLine());
		
		// sumar
		System.out.println( "La suma de " + a + " y " + b + " es " +sumar(a,b) );
		
		// dividir
		// ...
		System.out.println( "La division de " + a + " y " + b + " es " +dividir(a,b) );
	}
	public static int sumar(int a,int b){
		return a + b;
	}
	
	public static int dividir(int a,int b){
		if (b==0){
			System.out.println("No se puede dividir entre 0");
			return 0;
		}else{
			return a/b;
		}
		
	}
}
