import java.util.List;
import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления ряда Фибоначчи: ");
        int n = scanner.nextInt();
        getFibonacciRange(n);

        System.out.println("Введите номер члена ряда Фибоначчи(вычисление рекурсией): ");
        int c = scanner.nextInt();
        System.out.println(getFibonacciN(c));

        System.out.println("Введите номер члена ряда Фибоначчи(вычисление с помощью for): ");
        int f = scanner.nextInt();
        System.out.println(calculateWithFor(f));

        System.out.println("Введите число для получения длины ряда Фибоначчи(c помощью List) ");
        int num = scanner.nextInt();
        FibonacciCalculation calculation = new FibonacciCalculation(num);
        List<Integer> list = calculation.getList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Получение n-го члена Фибоначчи , с помощью рекурсии.Будем считать, что ряд начинается с 0,1
    public static int getFibonacciN(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getFibonacciN(n - 1) + getFibonacciN(n - 2);
        }

    }

    // Получение n-го члена Фибоначчи , с помощью цикла for
    //Сложность О(n)
    public static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }


    //Получение ряда n-чисел Фибоначчи. Будем считать, что ряд начинается с 0,1
    public static void getFibonacciRange(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}

