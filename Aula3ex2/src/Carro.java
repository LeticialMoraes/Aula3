public class Carro {
    String marca;
    String modelo;
    String cor;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor m;

    void ligar(){
        if(velocidadeAtual > 0){
            System.out.println("O carro esta ligado");
        }
        else{
            System.out.println("O Carro esta desligado");
        }
    }
    void acelerar(){
        if(velocidadeAtual<velocidadeMaxima){
            System.out.println("Pode acelerar");
        }
        else{
            System.out.println("Nao pode mais acelerar");
        }
    }
    void mostraInfo(){
        System.out.println("A marca do carro é: "+marca);
        System.out.println("O modelo do carro é: "+modelo);
        System.out.println("A Velocidade Maxima do carro é: "+velocidadeMaxima);
        System.out.println("A Velocidade atual do carro é: "+velocidadeAtual);
        ligar();
        acelerar();
    }
}
