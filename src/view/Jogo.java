package view;
import java.util.ArrayList;

import models.Jogador;
import models.Partida;

public class Jogo {
    ArrayList<Partida> partidas = new ArrayList<Partida>();
    public ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    // Método que cria uma nova partida
    public void novaPartida() {
        Partida p = new Partida();
        if(!partidas.isEmpty() && IU.mesmosjogadores()){
            p.jogadores = partidas.get(partidas.size()-1).jogadores;
            p.addJogadores(this);
            partidas.add(p);
        } else {
            p.addJogadores(this);
            partidas.add(p);
        }

        // Método que embaralha as Cartas do Baralho
        p.baralho.embaralhar();
        // Método que inicia o Laço da Partida
        p.iniciarPatida();
    }

    public void mostrarPlacar() {
        for (Jogador jogador : this.jogadores) {
            IU.mostraPlacar(jogador);
        }
    }

    public void mostrarHistoricoDePartidas() {
        IU.mostrarHistoricoDePartidas(partidas);

    }

    
}
