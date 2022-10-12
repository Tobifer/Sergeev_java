/*Задание 2
Составить алгоритм: если введенное имя совпадает с Вячеслав,
то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String answer = (name.equals("Вячеслав"))? "Привет, " + name: "Нет такого имени";
        System.out.print(answer);
    }
}