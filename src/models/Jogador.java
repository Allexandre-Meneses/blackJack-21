package models;
import java.util.ArrayList;

public class Jogador {
    String nome;
    ArrayList<Carta> cartasNaMao = new ArrayList<Carta>();
    Integer partidasVencidas = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Integer getPartidasVencidas() {
        return partidasVencidas;
    }

    // Método que Soma o valor de todas as cartas na mão do Jogador
    public Integer somarCartasNaMao(){
        Integer soma = 0;
        for (Carta tmp : this.cartasNaMao) {
            soma += tmp.valor;
        }
        return soma;
    }

    // Método para descartar as cartas na mão do Jogador
    public void descartarMao() {
        cartasNaMao.clear();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome;
    }
}
