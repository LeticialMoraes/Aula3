public class Main {
    public static void main(String[] args) {

        Carro gol = new Carro();
        Carro mobi = new Carro();

        gol.marca = "Chevrolet";
        mobi.marca = "Fiat";

        gol.modelo = "Gol";
        mobi.modelo = "Mobi";

        gol.cor = "Prata";
        mobi.cor = "Vermelho";

        gol.velocidadeAtual = 80;
        mobi.velocidadeAtual = 0;

        gol.velocidadeMaxima = 80;
        mobi.velocidadeMaxima = 100;

        gol.mostraInfo();
        mobi.mostraInfo();
    }
}