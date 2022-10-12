/*Задание 1
Составить алгоритм: если введенное число больше 7, то вывести “Привет”*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (number > 7){
            System.out.print("Привет");
        }

    }
}