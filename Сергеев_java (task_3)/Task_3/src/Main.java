/* Задание 3
Составить алгоритм: на входе есть числовой массив,
необходимо вывести элементы массива кратные 3
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Введите элемент: ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        System.out.print("\nЭлементы кратные трем:\n");
        for (int i = 0; i < size; i++){
            if (array[i] % 3 == 0){
                System.out.print(array[i]+"\n");
            } else {
                continue;
            }
        }

    }
}