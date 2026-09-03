// Точно не понял в каких заданиях нужно прописывать i++, а где i = i + 1, поэтому оставлю как есть
// Но я понял эту тему

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i = i + 1) { // Задача 1
            System.out.println(i);
        }

        System.out.println();

        for (int a = 10; a >= 1; a = a - 1) { // Задача 2
            System.out.println(a);
        }

        System.out.println();

        for (int b = 0; b < 17; b = b + 2) { // Задача 3
            System.out.println(b);
        }

        System.out.println();

        for (int c = 10; c >= -10; c = c - 1) { // Задача 4
            System.out.println(c);
        }

        System.out.println();

        for (int d = 1904; d <= 2096; d = d + 4) { // Задача 5
            System.out.println(d + " год является высокосным");
        }

        System.out.println();

        for (int e = 7; e <= 98; e = e + 7) { // Задача 6
            System.out.println(e);
        }

        System.out.println();

        for (int f = 1; f <= 512; f = f * 2) { // Задача 7
            System.out.println(f);
        }

        System.out.println();

        var cash = 29000; // Задача 8
        var total = 0;
        for (int g = 0; g <= 12; g++ ) {
            total = total + cash;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println();

        var salary = 29000; // Задача 9
        var fin = 0;
        for (var g = 0; g <= 12; g++ ) {
            fin = fin + fin / 88;
            fin = fin + salary;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + fin + " рублей.");
        }

        System.out.println();

        for (int h = 1; h <= 10; h++) { // Задача 10
            System.out.println("2 * " + h + " = " + 2 * h);
        }
    }
}