package com.dmdev.HomeWork;

//2. Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
//        Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
//        При решении создать и использовать следующие вынесенные функции:
//        - функция isPositive, определяющая, является ли число положительным
//        - функция isZero, определяющая, является ли число нулём
//        - функция discriminant, вычисляющая дискриминант

public class FiveOneTask2 {
    public static void main(String[] args) {
int a = 1;
int b = 6;
int c = 4;
int discriminant = discriminant(a,b,c);
double x;
if (isPositive (discriminant)){
    x = (double)(-b) + Math.sqrt((double)discriminant) / (double)(2 * a);
    double x2 = (double)(-b) - Math.sqrt((double)discriminant) / (double)(2 * a);
    System.out.println("x1: " + x);
    System.out.println("x2: " + x2);
} else if (isZero(discriminant)) {
    x = (double)(-b) / (2.0D * (double)a);
    System.out.println("x1: " + x);
}else {
    System.out.println("Дискриминант отрицательный");
}
}

    public static int discriminant (int a, int b, int c) { return b * b - 4 * a * c; }

    public static boolean isPositive(int value) {
        return value > 0;
    }

    public static boolean isZero (int value) {
        return value == 0;
    }

}


