package com.hikari;

public class Primes {
    public static void main(int number) throws Exception  {
        //В этот класс аргументом передается значение 'number', до которого (не включительно)
        //будут проверятся все числа на простоту
        for(int i = 2; i < number; i++) {
            if (isPrime(i) == true)
                System.out.print(i + " ");
        }
        System.out.print("\n");
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
