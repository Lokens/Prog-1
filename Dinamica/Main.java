/**
 * Exemplo de utilização das classes Acumulador e Arquivo.
 * 
 * @author Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
	{
        // Criação de um objeto acumulador para calcular a média
        // das das idades de um grupo de 5 pessoas.
		//Scanner input = new Scanner (System.in);
		
	/*	
        Acumulador idades = new Acumulador();

        idades.soma(30);
        idades.soma(10);
        idades.soma(20);
        idades.soma(12);
        idades.soma(14);
		idades.soma(9);
        idades.soma(45);
		
		double mediaIdades = (idades.getValor() / (idades.getContagemValoresRecebidos());
		
		System.out.println(idades.getValor());
        System.out.println(idades.getContagemValoresRecebidos());
		System.out.println("A media das idades eh: " + mediaIdades);

        // Criação de um arquivo fictício de 3 linhas, cada uma com o nome
        // de uma fruta.
        */
		//Arquivo arqFrutas = new Arquivo("frutas.txt", "C:\Users\mathe\Downloads");
		File arqFrutas = new File("frutas.txt", "\Users\mathe\Downloads");

		
        String[] frutas = new String[3];
        frutas[0] = "laranja";
        frutas[1] = "uva";
        frutas[2] = "abacate";

        arqFrutas.setLinhas(frutas);
        System.out.println("O arquivo de frutas: " + arqFrutas);
		
	
		
	
	}
}