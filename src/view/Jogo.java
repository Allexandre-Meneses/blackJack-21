package view;
import java.util.ArrayList;

import models.Partida;

public class Jogo {
    ArrayList<Partida> partidas = new ArrayList<Partida>();

    // Método que cria uma nova partida
    public void novaPartida() {
        Partida p = new Partida();
        // Condição que verifica se é a primeira Partida
        // Caso não seja a primeira partida, os jogadores da 
        // partida anterior serão adicionados na nova partida
        if(partidas.isEmpty()){
            p.addJogadores();
            partidas.add(p);
        } else {
            p.jogadores = partidas.get(partidas.size()).jogadores;
            p.addJogadores();
            partidas.add(p);
        }

        // Método que embaralha as Cartas do Baralho
        p.baralho.embaralhar();
        // Método que inicia o Laço da Partida
        p.iniciarPatida();
    }

    
}
