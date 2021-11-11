package com.company;

public class Main {

    public static void main(String[] args) {
        String iLoveYou;
        final int NUM=67;
        String word = "здраствуйте";
        iLoveYou=NUM+word;
        System.out.println(iLoveYou);

        if (NUM<0){
            System.out.println("вы сохранили отрицательное число");

        }else if(NUM>0){
            System.out.println("вы сохранили положитнльное число");
        }else {
            System.out.println("вы сохранили нуль");
        }
    }
}
