package com.hikari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception  {
        //Запрашивается ввод числа с клавиатуры, до которого (не включительно) будут проверятся все числа
        Scanner in = new Scanner(System.in);
        System.out.print("До какого числа вы хотите вывести все простые: ");
        int x = in.nextInt();
        //Основной цикл проверки, который передает все числа от 2 как аругмент
        //в метод isPrime и получает результат - является число простым или нет
        //если число простое - оно выводится в консоль
        for(int i = 2; i < x; i++) {
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
