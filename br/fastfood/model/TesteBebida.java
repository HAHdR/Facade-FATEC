package br.fastfood.model;

// TesteBurger.java

public class TesteBebida {
    public static void main(String[] args) {
        Bebida b = new Bebida("Sprite", 9.00);
        System.out.println("Nome: " + b.getNome());
        System.out.println("Preço: " + b.getPreco());
        System.out.println("ToString: " + b);
    }
}