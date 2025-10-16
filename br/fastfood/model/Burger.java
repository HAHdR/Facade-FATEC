package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;
    
    /**
     * Burger Construtor - Inicializa as variáveis "nome" e "preco"
     *
     * @param nome String
     * @param preco double
     */
    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    /**
     * Retorna o nome do hamburger
     *
     * @return o nome do hamburger
     */
    @Override
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna o preco do hamburger
     *
     * @return o preco do hamburger
     */
    @Override
    public double getPreco() {
        return preco;
    }
    
    /**
     * Formata a saída textual 
     *
     * @return a String formatada
     */
    @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", nome, preco);
    }
}