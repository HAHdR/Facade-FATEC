package br.fastfood.model;

// TesteBurger.java

public class TesteSobremesa {
    public static void main(String[] args) {
        Sobremesa s = new Sobremesa("Big Cheddar", 18.00);
        System.out.println("Nome: " + s.getNome());
        System.out.println("Preço: " + s.getPreco());
        System.out.println("ToString: " + s);
    }
}