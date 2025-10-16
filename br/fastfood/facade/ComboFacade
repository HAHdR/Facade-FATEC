package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;
    
    /**
     * Cria um combo baseado no código fornecido
     * @param codigo número do combo (1, 2 ou 3)
     */
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                Burger burger1 = new Burger("Big Cheddar", 18.00);
                Bebida bebida1 = new Bebida("Coca-Cola", 8.00);
                Sobremesa sobremesa1 = new Sobremesa("Sundae", 9.90);

                combo = new Combo(burger1, bebida1, sobremesa1);
                break;
            case 2:
                Burger burger2 = new Burger("Mega Bacon", 16.00);
                Bebida bebida2 = new Bebida("Guaraná", 7.50);
                Sobremesa sobremesa2 = new Sobremesa("Torta de Maçã", 9.00);

                combo = new Combo(burger2, bebida2, sobremesa2);
                break;
            case 3:
                Burger burger3 = new Burger("Mini Burger", 12.00);
                Bebida bebida3 = new Bebida("Suco de Laranja", 6.00);
                Sobremesa sobremesa3 = new Sobremesa("Sorvete", 4.90);

                combo = new Combo(burger3, bebida3, sobremesa3);
                break;
            default:
                System.out.println(" ⚠ Código de combo inválido! (1, 2 ou 3)");
                break;
        }
    }
    
    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println(" ❗ Nenhum combo criado ainda!");
            return;
        }
        
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println("\n 🍔 Hamburguer: " + combo.getBurger());
        System.out.println(" 🥛 Bebida: " + combo.getBebida());
        System.out.println(" 🍦 Sobremesa: " + combo.getSobremesa());
        System.out.println("\n==========================");
    }
    
    /**
     * Retorna o preço total do combo
     * @return preço total
     */
    public double getPrecoTotal() {
        return combo.getPrecoTotal();
    }
}
