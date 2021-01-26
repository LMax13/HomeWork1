package com.dmdev.HomeWork;
import java.util.Scanner;
//1. Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
//        Вывести дату следующего дня в формате "День.Месяц.Год".
//        Учесть переход на следующий месяц, а также следующий год.
//        Форматирование строки "День.Месяц.Год" вынести в отдельную функцию
public class fiveonetask1 {
    
    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 2020;
        if (isDateValid(day, month, year)) {
            printNextDay(day, month, year);
        } else {
            System.out.println("Число записанно некоректно");
        }
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (day > 0 && month > 0 && month <= 12 && year >= 0) {
            boolean result;
            if (month == 2) {
                if (isLeapYear(year)) {
                    result = day <= 29;
                } else {
                    result = day <= 28;
                }
            } else if (month != 4 && month != 6 && month != 9 && month != 11) {
                result = day <= 31;
            } else {
                result = day <= 30;
            }
            return result;
        } else {
            return false;
        }
    }

    public static void printNextDay(int day, int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day == 29) {
                    System.out.println(formatDate(1, month + 1, year));
                } else {
                    System.out.println(formatDate(day + 1, month, year));
                }
            } else if (day == 28) {
                System.out.println(formatDate(1, month + 1, year));
            } else {
                System.out.println(formatDate(day + 1, month, year));
            }
        } else if (month != 4 && month != 6 && month != 9 && month != 11) {
            if (day == 31) {
                if (month == 12) {
                    System.out.println(formatDate(1, 1, year + 1));
                } else {
                    System.out.println(formatDate(1, month + 1, year));
                }
            } else {
                System.out.println(formatDate(day + 1, month, year));
            }
        } else if (day == 30) {
            System.out.println(formatDate(1, month + 1, year));
        } else {
            System.out.println(formatDate(day + 1, month, year));
        }
    }

    public static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}


