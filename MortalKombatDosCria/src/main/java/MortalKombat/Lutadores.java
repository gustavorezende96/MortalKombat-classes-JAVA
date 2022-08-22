package MortalKombat;

public class Lutadores {
    
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

    public Lutadores(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
            System.out.println("O jogador " + this.getNome() + " com nacionalidade " + this.getNacionalidade()
                    + " com seus " + this.getAltura() + " de altura, e seus incriveis " + this.getPeso() +
                    "KG, ira lutar na categoria " + this.getCategoria() + "!");
            System.out.println("Tabela do lutador: \n" + this.getVitorias()
                    + " vitorias \n" + this.getDerrotas() + " derrotas, e \n" + this.getEmpates()
                    + " empates.");
        }

        public void status(){
            System.out.println("Status Lutador: \n" + this.getNome() + "\n" + this.getAltura() + "\n"
                    + this.getPeso() + "\n" + this.getNacionalidade() + "\n" + this.getCategoria());
        }

        public void ganhar(){
            System.out.println("O lutador " + this.getNome() + " ganhou!");
            this.setVitorias(this.getVitorias() + 1);;
        }

        public void perder(){
            System.out.println("O lutador " + this.getNome() + " perdeu!");
            this.setDerrotas(this.getDerrotas() + 1);
        }
        public void empate(){
            System.out.println("O lutador " + this.getNome() + " empatou!");
            this.setEmpates(this.getEmpates() + 1);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNacionalidade() {
            return nacionalidade;
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
            setCategoria();
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria() {
            if(this.getPeso() < 52.3){
                categoria =  "Inválido!";
            }
            else if (this.getPeso() <= 70.3){
                categoria = "Leve";
            }
            else if(this.getPeso() <= 83.9){
                categoria = "Médio";
            }
            else if(this.getPeso() <= 120.2){
                categoria = "Pesado";
            }
            else {
                System.out.println("Invalido!");
            }
        }

        public int getVitorias() {
            return vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }
    }


