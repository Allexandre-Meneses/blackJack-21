package view;
import java.util.ArrayList;
import java.util.Scanner;

import models.Jogador;
import models.Partida;

public class IU {
    static Scanner sc = new Scanner(System.in);
    static Jogo jogo = new Jogo();

    // Método para imprimir e capturar alguma opção do Menu do Jogo
    public static boolean menu() {
        System.out.println("|1|Nova Partida");
        System.out.println("|2|Mostrar Placar");
        System.out.println("|3|Mostrar Histórico de Partidas");
        System.out.println("|0|Sair");

        switch (sc.next()){
            case "1":
                // Método para criar uma nova partida
                jogo.novaPartida();
                return true;
            case "2":
                // Método para mostrar placar dos jogadores
                jogo.mostrarPlacar();
                return true;
            case "3":
                // Método para mostrar o histórico de Partidas
                jogo.mostrarHistoricoDePartidas();
                return true;
            case "0":
                jogo.mostrarHistoricoDePartidas();
                saudacaoFinal();
                return false;
            default:
                return true;
        }


    }

    // Método que imprime uma saudação ao Final da Execução
    private static void saudacaoFinal() {
        System.out.println("Obrigado por Jogar!");
    }

    // Método para pegar nome de um Jogador
    static public String pegaNome(){
        System.out.print("Digite o nome do Jogador: ");
        return sc.next();
    }

    // Método que pergunta se o usuário deseja adicionar outro jogador
    public static boolean continuarAddJogador() {
        System.out.print("Deseja add outro Jogador?(S/N) ");
        switch (sc.next().toUpperCase()){
            case "S":
                return true;
            case "N":
                return false;
            default:
                System.out.println("Opção Inválida");
                return continuarAddJogador(); 
        }
    }

    // Método para imprimir o nome e perguntar se deseja receber outra carta
    public static boolean receberOutraCarta(String nome) {
        System.out.println("----------------------------------------");
        System.out.print(nome + ", Deseja receber outra Carta?(S/N) ");
        switch (sc.next().toUpperCase()){
            case "S":
                return true;
            case "N":
                return false;
            default:
                System.out.println("Opção inválida");
                return receberOutraCarta(nome);
        }
    }

    // Método para mostrar os vencedores da Partida
    static public void mostrarVencedores(ArrayList<Jogador> vencedores) {
        if (vencedores.isEmpty()) {
            System.out.println("********************************");
            System.out.println("Empate, todos passaram de 21");
            System.out.println("********************************");
        } else {
            System.out.println("************************************");
            System.out.println("O(s) Vencedor(es) da Partida:");
            for (Jogador tmp : vencedores) {
                System.out.println(tmp + " com " + tmp.somarCartasNaMao() + " pontos Venceu!");
                System.out.println("****************************************");
            }
        }
    }

    // Método que diz quem está recebendo as cartas
    public static void dizQuemRecebe(String nome) {
        System.out.println("---------------------------------------");
        System.out.println(nome + ", Receba e some suas Cartas!");
        System.out.println("------------------------------------------");
    }

    // Método que pergunta ao usuário se ele deseja jogar com os mesmos jogadores da partida Anterior
    public static boolean mesmosjogadores() {
        System.out.print("Deseja jogar com os mesmos jogadores da partida anterior?(S/N) ");
        switch (sc.next().toUpperCase()){
            case "S":
                return true;
            case "N":
                return false;
            default:
                return mesmosjogadores();
        }
    }

    // Método para imprimir o Histórico de Partidas
    public static void mostrarHistoricoDePartidas(ArrayList<Partida> partidas) {
        for (Partida partida : partidas) {
            System.out.println("***************************************");
            System.out.println((partidas.indexOf(partida)+1) + "a Partida!");
            System.out.println("---------------------------------------------");
            if (partida.vencedores.isEmpty()) {
                System.out.println("Partida Empatada, Não Houve Vencedores!");
            } else {
                System.out.println("O(s) vencedor(es) da Partida foram: ");
            }
            for (Jogador vencedor : partida.vencedores) {
                System.out.println(vencedor + " com " + vencedor.somarCartasNaMao() + " pontos!");
            }
        }
        System.out.println("**************************************************");
    }

    // Método que imprime o tanto de vezes que um jogador venceu
    public static void mostraPlacar(Jogador jogador) {
        System.out.println("-------------------------------------------------------------");
        System.out.println(jogador + " Venceu " + jogador.getPartidasVencidas() + " Partidas");
    }
}
