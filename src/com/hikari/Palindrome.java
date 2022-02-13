package com.hikari;

    public class Palindrome {
            public static void main (String[] args){
                for (int i = 0; i < args.length; i++) {
                    //Берет первое слово из входных агрументов args и присваивает переменной test_palindrome
                    String test_palindrome = args[i];
                    //Выводит изначальное слово, чтобы было понятно что именно проверяли на палиндромность
                    System.out.print(test_palindrome + " - ");
                    //Передает слово в метод isPalindrome. Результат true - слово является палиндромом
                    System.out.println(isPalindrome(test_palindrome));
                }
            }
            public static String reverseString (String test_palindrome){
                //Создаем пустую строку, в которую по символу с конца буду добавлять буквы из изначального слова
                String rezult_string = "";
                for (int i = test_palindrome.length() - 1; i >= 0; i--){
                    rezult_string += test_palindrome.charAt(i);
                }
                //Возвращаю перевернутое слово
                return rezult_string;
            }
            public static boolean isPalindrome (String original){
                String reversed = reverseString(original);
                //Сравниваю оригинальное слово с его перевернутой версией
                //Возвращает true - палиднром; false - не палиндром
                return original.equals(reversed);
            }
        }
