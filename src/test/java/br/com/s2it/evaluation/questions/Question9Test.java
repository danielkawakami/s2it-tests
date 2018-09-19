package br.com.s2it.evaluation.questions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Question9Test {

    @Test
    public void shouldSumProperly() {
        // Given
        BinaryTree f1 = new BinaryTree(9);
        BinaryTree f2 = new BinaryTree(1);
        BinaryTree f3 = new BinaryTree(7);
        BinaryTree left = new BinaryTree(6, f1, f2);
        BinaryTree rightFirstChild = new BinaryTree(8);
        BinaryTree rightSecondChild = new BinaryTree(2, f3, null);
        BinaryTree right = new BinaryTree(4, rightFirstChild, rightSecondChild);
        BinaryTree mainTree = new BinaryTree(3, left, right);

        // When
        int actualResult = new Question9().sum(mainTree);

        // Then
        assertThat(actualResult, is(40));
    }
}