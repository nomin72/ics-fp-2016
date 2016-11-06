package com.myCompany.labs.dao;

/**
 * Created by Romashkin on 06.11.2016.
 */
public class FibonacciDAO extends AbstractDAO{

    private int num;
    private int counter;
    private int firstNum;
    private int seccondNum;

    public FibonacciDAO(){
        num         = 0;
        firstNum    = 0;
        seccondNum  = 1;
        zeroCounter();
    }

    private final int fib(){
        if (num == 0)
            return 0;

        counter++;

        if (counter < num){

            seccondNum = firstNum + seccondNum;
            firstNum = seccondNum - firstNum;

            fib();
        }

        zeroCounter();
        return firstNum;
    }

    private void zeroCounter() {
        if (counter != 0)
            counter = 0;
    }

    public void printFibonacci(int n){
        num = n;
        System.out.println( num + " element number Fibonacci is: " + fib());
    }
}
