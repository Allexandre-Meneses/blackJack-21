
public class Carta {
    String nome, naipe;
    Integer valor;

    public Carta(String nome, String naipe, Integer valor) {
        this.nome = nome;
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + " de " + naipe;
    }
}
