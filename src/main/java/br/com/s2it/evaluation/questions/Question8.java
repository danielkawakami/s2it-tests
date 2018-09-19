package br.com.s2it.evaluation.questions;

public class Question8 {
    public int calculate(int a, int b) {
        System.out.println("A = " + a + ", B = " + b);
        String firstArg = String.valueOf(a);
        String secondArg = String.valueOf(b);
        if(firstArg.length() + secondArg.length() > 7) {
            return -1;
        }
        int lowerLength = firstArg.length() < secondArg.length() ? firstArg.length() : secondArg.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lowerLength; i++) {
            sb.append(firstArg.substring(i, i+1))
              .append(secondArg.substring(i, i+1));
        }
        if(firstArg.length() > lowerLength) {
            sb.append(firstArg.substring(lowerLength, firstArg.length()));
        }
        else if(secondArg.length() > lowerLength) {
            sb.append(secondArg.substring(lowerLength, secondArg.length()));
        }
        System.out.println(sb.toString());
        int result = Integer.parseInt(sb.toString());
        if(result > 1000000) {
            return -1;
        }
        return result;
    }
}
