package com.hikari;

public class Main {

    public static void main(String[] args) {
        for(int i = 2; i < 100; i++) {
            if (isPrime(i) == true)
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n){
        /*Выполняется проверка на простоту числа
         Делим на все числа от 2 до заданного числа (n)*/
        boolean rez = true;
        //rez - это флаг, если он true - число простое
        for(int i = 2; i < n; i++) {
            if (n % i == 0){
                rez = false;
            }
        };
        return rez;
    }
}
