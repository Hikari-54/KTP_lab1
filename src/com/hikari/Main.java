package com.hikari;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception  {
        //Запрашивается ввод числа с клавиатуры, до которого (не включительно) будут проверятся все числа
        Scanner in = new Scanner(System.in);
        System.out.print("До какого числа вы хотите вывести все простые: ");
        //В переменную 'number' с клавиатуры вводится число
        int number = in.nextInt();
        //Из класса Primes используется метод main, в который входным аргументом передается поле(переменная) number
        Primes.main(number);

    }
}
