package com.hikari;

public class Main {
    public static void main(String[] args) throws Exception  {
        /*
        //Запрашивается ввод числа с клавиатуры, до которого (не включительно) будут проверятся все числа
        Scanner in = new Scanner(System.in);
        System.out.print("До какого числа вы хотите вывести все простые: ");
        //В переменную 'number' с клавиатуры вводится число
        int number = in.nextInt();
        //Из класса Primes используется метод main, в который входным аргументом передается поле(переменная) number
        Primes.main(number);
        */
        //Вызваю метод main из класса Palindrome. Входные агрументы нужно передавать значениями из командной строки.
        //Они копируются из метода main в этом классе
        //Изменить их можно в настройках конфигурации сборки
        Palindrome.main(args);
    }
}
