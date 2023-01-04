package models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Baralho {
    ArrayList<Carta> baralho =  new ArrayList<Carta>();
    String[] naipes = {"Ouro", "Espadas", "Paus", "Copas"};
    Map<String, Integer> cartas = new HashMap<String, Integer>();

    Baralho() {

        /*
        cartas.put("A", 1);
        cartas.put("2", 1);
        cartas.put("3", 1);
        cartas.put("4", 1);
        cartas.put("5", 1);
        cartas.put("6", 1);
        cartas.put("7", 1);
        cartas.put("8", 1);
        cartas.put("9", 1);
        cartas.put("10", 1);
        cartas.put("J", 1);
        cartas.put("Q", 1);
        cartas.put("K", 1);
        */

        for (String naipe : naipes) {
            baralho.add(new Carta("A", naipe, 1));
            for (Integer count = 2; count <= 10; count++) {
                baralho.add(new Carta(count.toString(), naipe, count));
            }
            baralho.add(new Carta("J", naipe, 10));
            baralho.add(new Carta("Q", naipe, 10));
            baralho.add(new Carta("K", naipe, 10));
        }

        /*
        baralho.add(new Carta("1", "Ouro", 1));
        baralho.add(new Carta("2", "Ouro", 2));
        baralho.add(new Carta("3", "Ouro", 3));
        baralho.add(new Carta("4", "Ouro", 4));
        baralho.add(new Carta("5", "Ouro", 5));
        baralho.add(new Carta("6", "Ouro", 6));
        baralho.add(new Carta("7", "Ouro", 7));
        baralho.add(new Carta("8", "Ouro", 8));
        baralho.add(new Carta("9", "Ouro", 9));
        baralho.add(new Carta("10", "Ouro", 10));
  
        baralho.add(new Carta("J", "Ouro", 10));
        baralho.add(new Carta("Q", "Ouro", 10));
        baralho.add(new Carta("K", "Ouro", 10));

        baralho.add(new Carta("1", "Espadas", 1));
        baralho.add(new Carta("2", "Espadas", 2));
        baralho.add(new Carta("3", "Espadas", 3));
        baralho.add(new Carta("4", "Espadas", 4));
        baralho.add(new Carta("5", "Espadas", 5));
        baralho.add(new Carta("6", "Espadas", 6));
        baralho.add(new Carta("7", "Espadas", 7));
        baralho.add(new Carta("8", "Espadas", 8));
        baralho.add(new Carta("9", "Espadas", 9));
        baralho.add(new Carta("10", "Espadas", 10));

        baralho.add(new Carta("J", "Espadas", 10));
        baralho.add(new Carta("Q", "Espadas", 10));
        baralho.add(new Carta("K", "Espadas", 10));

        baralho.add(new Carta("1", "Paus", 1));
        baralho.add(new Carta("2", "Paus", 2));
        baralho.add(new Carta("3", "Paus", 3));
        baralho.add(new Carta("4", "Paus", 4));
        baralho.add(new Carta("5", "Paus", 5));
        baralho.add(new Carta("6", "Paus", 6));
        baralho.add(new Carta("7", "Paus", 7));
        baralho.add(new Carta("8", "Paus", 8));
        baralho.add(new Carta("9", "Paus", 9));
        baralho.add(new Carta("10", "Paus", 10));

        baralho.add(new Carta("J", "Paus", 10));
        baralho.add(new Carta("Q", "Paus", 10));
        baralho.add(new Carta("K", "Paus", 10));

        baralho.add(new Carta("1", "Copas", 1));
        baralho.add(new Carta("2", "Copas", 2));
        baralho.add(new Carta("3", "Copas", 3));
        baralho.add(new Carta("4", "Copas", 4));
        baralho.add(new Carta("5", "Copas", 5));
        baralho.add(new Carta("6", "Copas", 6));
        baralho.add(new Carta("7", "Copas", 7));
        baralho.add(new Carta("8", "Copas", 8));
        baralho.add(new Carta("9", "Copas", 9));
        baralho.add(new Carta("10", "Copas", 10));

        baralho.add(new Carta("J", "Copas", 10));
        baralho.add(new Carta("Q", "Copas", 10));
        baralho.add(new Carta("K", "Copas", 10));
        */

    }

    // Método para embaralhar as cartas do Baralho
    public void embaralhar() {
        Collections.shuffle(this.baralho);   
    }

    // Método para imprimir o Baralho
    public void imprimirBaralho() {
        for (Carta carta : baralho) {
            System.out.println(carta);
        }
    }
 
}
