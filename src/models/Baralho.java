package models;
import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    ArrayList<Carta> cartas =  new ArrayList<Carta>();
    String[] naipes = {"Ouro", "Espadas", "Paus", "Copas"};

    Baralho() {

        for (String naipe : naipes) {
            cartas.add(new Carta("A", naipe, 1));
            for (Integer count = 2; count <= 10; count++) {
                cartas.add(new Carta(count.toString(), naipe, count));
            }
            cartas.add(new Carta("J", naipe, 10));
            cartas.add(new Carta("Q", naipe, 10));
            cartas.add(new Carta("K", naipe, 10));
        }

    }

    // Método para embaralhar as cartas do Baralho
    public void embaralhar() {
        Collections.shuffle(this.cartas);   
    }

    // Método para imprimir o Baralho
    public void imprimirBaralho() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
 
}
