package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;
    
    /**
     * Sobremesa Construtor - Inicializa as variáveis "nome" e "preco"
     *
     * @param nome String
     * @param preco double
     */
    public Sobremesa(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    /**
     * Retorna o nome da sobremesa
     *
     * @return o nome da sobremesa
     */
    @Override
    public String getNome(){
        return nome;
    }
    
    /**
     * Retorna o preco da sobremesa
     *
     * @return o preco da sobremesa
     */
    @Override
    public double getPreco(){
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