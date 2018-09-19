package br.com.s2it.evaluation.questions;

public class Question9 {
    public int sum(BinaryTree tree) {
        if(tree == null) {
            return 0;
        }
        return tree.getValor() + sum(tree.getLeft()) + sum(tree.getRight());
    }
}
