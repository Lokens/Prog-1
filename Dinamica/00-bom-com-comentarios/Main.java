/**
 * Exemplo de utilização das classes Acumulador e Arquivo.
 * 
 * @author Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class Main {
    public static void main(String[] args) {
        // Criação de um objeto acumulador para calcular a média
        // das das idades de um grupo de 5 pessoas.
        Acumulador idades = new Acumulador();

        idades.soma(33);
        idades.soma(12);
        idades.soma(45);
        idades.soma(24);
        idades.soma(22);

        double mediaIdades = idades.getValor() / idades.getContagemValoresRecebidos();
        System.out.println("A media das idades eh: " + mediaIdades);

        // Criação de um arquivo fictício de 3 linhas, cada uma com o nome
        // de uma fruta.
        Arquivo arqFrutas = new Arquivo("frutas.txt", "/home/fernando/Downloads/");

        String[] frutas = new String[3];
        frutas[0] = "laranja";
        frutas[1] = "uva";
        frutas[2] = "abacate";

        arqFrutas.setLinhas(frutas);
        System.out.println("O arquivo de frutas: " + arqFrutas);
    }
}