import java.util.ArrayList;
import java.util.Scanner;

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
            case "0":
                return false;
            default:
                return true;
        }


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
            System.out.println("Empate, todos passaram de 21");
        } else {
            System.out.println("O(s) Vencedor(es) da Partida:");
            for (Jogador tmp : vencedores) {
                System.out.println(tmp);
            }
        }
    }

    // Método que diz quem está recebendo as cartas
    public static void dizQuemRecebe(String nome) {
        System.out.println(nome + ", Receba e some suas Cartas!");
    }
}
