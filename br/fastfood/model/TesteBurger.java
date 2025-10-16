package br.fastfood.model;

// TesteBurger.java

public class TesteBurger {
    public static void main(String[] args) {
        Burger b = new Burger("Big Cheddar", 18.00);
        System.out.println("Nome: " + b.getNome());
        System.out.println("Preço: " + b.getPreco());
        System.out.println("ToString: " + b);
    }
}