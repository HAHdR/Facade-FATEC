package br.fastfood.model;

public class Combo {
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;
    
    /**
     * Combo Construtor - Inicializa as variáveis "burger", "bebida" e "sobremesa"
     *
     * @param burger ItemCombo
     * @param bebida ItemCombo
     * @param sobremesa ItemCombo
     */
    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }
    
    /**
     * Retorna o hamburguer
     *
     * @return burger - Acesso para outras classe, por ser um atributo privado
     */
    public ItemCombo getBurger() {
        return burger;
    }
    
    /**
     * Retorna a bebida
     *
     * @return bebida - Acesso para outras classe, por ser um atributo privado
     */
    public ItemCombo getBebida() {
        return bebida;
    }
    
    /**
     * Retorna a sobremesa
     *
     * @return sobremesa - Acesso para outras classe, por ser um atributo privado
     */
    public ItemCombo getSobremesa() {
        return sobremesa;
    }
    
    /**
     * Retorna o preco final do combo com bebida, hamburguer e sobremesa
     *
     * @return o preco total do combo
     */
    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}