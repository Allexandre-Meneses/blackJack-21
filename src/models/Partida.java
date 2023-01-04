package models;
import java.util.ArrayList;

import view.IU;

public class Partida {
    public ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    public ArrayList<Jogador> vencedores = new ArrayList<Jogador>();
    public Baralho baralho;

    public Partida() {
        this.baralho = new Baralho();
    }

    // Método para adicionar jogadores à partida
    public void addJogadores() {
        // Verificação se já existe jogadores na partida
        // Caso não exista, já adicionar dois jogadores, pois é o número mínimo
        // de Jogadores na Partida
        if ( this.jogadores.isEmpty()) {
            jogadores.add(new Jogador(IU.pegaNome()));
            jogadores.add(new Jogador(IU.pegaNome()));
        }

        // Laço que Verifica se o Usuário quer adicionar mais jogadores
        while(IU.continuarAddJogador()) {
            jogadores.add(new Jogador(IU.pegaNome()));
        }
    }

    // Método que inicia o laço da Partida
    public void iniciarPatida() {

        // Laço da Partida
        for(Jogador tmp : jogadores) {
            IU.dizQuemRecebe(tmp.nome);
            darCarta(tmp);
            do {
                darCarta(tmp);
            }
            while(IU.receberOutraCarta(tmp.nome));
            // Método que verifica os vencedores da Partida
        }
        quemVenceu();

        // Laço para descartar as cartas de partidas anteriores dos jogadores
        for (Jogador tmp : jogadores) {
            tmp.descartarMao();
        }
    }

    public void darCarta(Jogador j) {
        Carta cartaDaVez = this.baralho.baralho.get(0);
        System.out.println(cartaDaVez);
        j.cartasNaMao.add(cartaDaVez);
        this.baralho.baralho.remove(cartaDaVez);
    }

    private void quemVenceu() {
        Integer maiorPontuacao = 0;
        for (Jogador tmp : this.jogadores) {
            if (passouDe21(tmp)) {
                continue;
            }

            if (tmp.somarCartasNaMao() >= maiorPontuacao) {
                maiorPontuacao = tmp.somarCartasNaMao();
            } 
        }

        
        for (Jogador tmp : jogadores) {
            if (temAMaiorPontuacao(tmp, maiorPontuacao)) {
                tmp.partidasVencidas += 1;
                Jogador vencedor = new Jogador(tmp.nome);
                vencedor.cartasNaMao = (ArrayList<Carta>) tmp.cartasNaMao.clone();
                this.vencedores.add(vencedor);
            }
        }
        // Método para mostrar na tela os vencedores da Partida
        IU.mostrarVencedores(vencedores);
    }

    // Método que verifica se o valor das Cartas dos Jogadores passou de 21
    private boolean passouDe21(Jogador j) {
        if(j.somarCartasNaMao() > 21) {
            return true;
        }
        return false;
    }

    // Método que verifica se o jogador tem a maior pontuação entre eles
    private boolean temAMaiorPontuacao(Jogador j, Integer maiorPontuacao) {
        if (j.somarCartasNaMao() == maiorPontuacao) {
            return true;
        } else 
        return false;
    }
}


