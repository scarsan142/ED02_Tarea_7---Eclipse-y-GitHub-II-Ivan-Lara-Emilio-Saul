import java.util.Scanner;
import java.lang.Math;

public class Prog {

	public static void main(String[] args) {
		Scanner leerradio = new Scanner(System.in);
		int radio=0;
		double volumen;
		volumen = (4 * (Math.PI) * (Math.pow(radio,3))/3);
		System.out.println("Introduce el radio de la esfera");
		radio=leerradio.nextInt();
	double area;
	area = (Math.PI) * (Math.pow(radio, 2));
	System.out.println("El área de la esfera es "+area);
	System.out.println("Finalizado Version 2");
		double longitud;
		longitud = 2 * (Math.PI)* radio;
		System.out.println("La longitud de la circunferencia es "+longitud);
		System.out.println("Finalizado Version 3");
	}
}
