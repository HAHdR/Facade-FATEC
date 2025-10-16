package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;
    
    /**
     * Bebida Construtor - Inicializa as variáveis "nome" e "preco"
     *
     * @param nome String
     * @param preco double
     */
    public Bebida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    /**
     * Retorna o nome da bebida
     *
     * @return o nome da bebida
     */
    @Override
    public String getNome(){
        return nome;
    }
    
    /**
     * Retorna o preco da bebida
     *
     * @return o preco da bebida
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
