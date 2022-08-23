package MortalKombat;

import java.util.Random;

public class Luta {

    private Lutadores desafiado;
    private Lutadores desafiante;
    private Integer round;
    private Boolean aprovada;


    public void marcarLuta(Lutadores l1, Lutadores l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada!");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta invalida");
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("---LUTADOR 1---");
            this.desafiado.apresentar();
            System.out.println("---LUTADOR 2---");
            this.desafiante.apresentar();

            Random randomico = new Random();
            int winner = randomico.nextInt(3);

            switch (winner) {
                case 0:
                    System.out.println("EMPATE!!!!!");
                    this.desafiante.empate();
                    this.desafiado.empate();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " WINS!");
                    this.desafiante.ganhar();
                    this.desafiado.perder();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " WINS!");
                    this.desafiante.perder();
                    this.desafiado.ganhar();
            }
        } else {
            System.out.println("A luta não foi aprovada!");
        }


    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
