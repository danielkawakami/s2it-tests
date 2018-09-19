package br.com.s2it.evaluation.questions;

public class BinaryTree {
    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int valor) {
        this.valor = valor;
    }

    public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    public int getValor() {
        return valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
}
