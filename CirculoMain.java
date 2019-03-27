import java.util.Scanner;

public class CirculoMain {
	
	public static void main(String[]args){
		
		double valorRaio, valorArea;
		Circulo umCirculo;
		umCirculo= new Circulo();
		System.out.println("Digite o Valor do Raio");
		Scanner sc =new Scanner (System.in);
		valorRaio=sc.nextInt();
		umCirculo.raio=valorRaio;
		valorArea=umCirculo.calcularArea();
		System.out.println("A area e " + valorArea);
	
	
	}
	
	
}