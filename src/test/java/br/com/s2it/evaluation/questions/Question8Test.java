package br.com.s2it.evaluation.questions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * TDD approach used - Question 8 with 100% code coverage
 */
public class Question8Test {

    @Test
    public void shouldTestFirstNumberC() {
        // Given
        int A = 102;
        int B = 512;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(String.valueOf(actualResult).charAt(0), is('1'));
    }

    @Test
    public void shouldTestSecondNumberC() {
        // Given
        int A = 102;
        int B = 347;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(String.valueOf(actualResult).charAt(1), is('3'));
    }

    @Test
    public void shouldTestThirdNumberC() {
        // Given
        int A = 102;
        int B = 347;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(String.valueOf(actualResult).charAt(2), is('0'));
    }

    @Test
    public void shouldTestABSameLength() {
        // Given
        int A = 102;
        int B = 347;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(130427));
    }

    @Test
    public void shouldAGreaterLengthThanB() {
        // Given
        int A = 1356;
        int B = 24;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(123456));
    }

    @Test
    public void shouldBGreaterLengthThanA() {
        // Given
        int A = 13;
        int B = 2478;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(123478));
    }

    @Test
    public void shouldResultEquals1000000() {
        // Given
        int A = 100000;
        int B = 0;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(1000000));
    }

    @Test
    public void shouldResultGreaterThan1000000() {
        // Given
        int A = 100001;
        int B = 0;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(-1));
    }

    @Test
    public void shouldReturnMinusOne() {
        // Given
        int A = 1234;
        int B = 5678;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(-1));
    }

    @Test
    public void shouldExampleNotCorrect() {
        // Given
        int A = 10256;
        int B = 512;
        Question8 question8 = new Question8();

        // When
        int actualResult = question8.calculate(A, B);

        // Then
        assertThat(actualResult, is(-1));
    }
}