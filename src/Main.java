import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextDouble() * 20 - 10;

        x = x - Math.pow(x, 3) / 3 + Math.pow(x, 5) / 5;

        System.out.println("x=" + x);

        double y = random.nextDouble() * 20 - 10;
        if (y != -1 && x != -34) {
            x = (x + y) / (y + 1) - (x * y - 12) / (34 + x);
            System.out.println("x=" + x);
        } else {
            System.out.println("No solutions");
        }


        double z;
        z = Math.sin(x + 1) - Math.sin(x - 1);
        System.out.println("z=" + z);


        double b, v1, v2, v3, v4;
        System.out.println("sin x: " + (v1 = Math.sin(x)));
        System.out.println("cos x: " + (v2 = Math.cos(x)));
        System.out.println("tan x: " + (v3 = Math.tan(x)));
        System.out.println("ctan x: " + (v4 = 1 / Math.tan(x)));
        if (Math.sin(x) != 0 && Math.cos(x) != 0 && v4 > 1) {
            b = Math.pow(1 - v3, v4);
            b = b + Math.cos(x - y);
            System.out.println("b=" + b);
        } else {
            System.out.println("No solutions ");
        }

        double l;
        if (x != 0) {
            l = Math.log(Math.abs((y - Math.sqrt(Math.abs(x)) * (x - y / (x + Math.pow(x, 2) / 4)))));
            System.out.println("l=" + l);
        } else {
            System.out.println("No solutions");
        }

        // if (Math.abs(x) < 1e-14) { // -0.0000000000000001

        // hometask1();
        //hometask2();
        //hometask3();
        //hometask4();
        //hometask6();
        //hometask7();
        //hometask8();
        //hometask9();
        // hometask5();
        hometask10();
    }


    /**
     * Написать программу, которая проверяет, является ли введённое пользователем целое число четным.
     */
    public static void hometask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Chet (even)");
        } else {
            System.out.println("Nechet (odd)");
        }

    }

    /**
     * Написать программу, которая проверяет, делится ли введённое с клавиатуры целое число на 3, на 5, на 7.
     */
    public static void hometask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println("введённое с клавиатуры целое число делится на 3");
        } else {
            System.out.println("введённое с клавиатуры целое число НЕ делится на 3.");
        }

        if (number % 5 == 0) {
            System.out.println("введённое с клавиатуры целое число делится на 5.");
        } else {
            System.out.println("введённое с клавиатуры целое число НЕ делится на 5.");
        }

        if (number % 7 == 0) {
            System.out.println("введённое с клавиатуры целое число делится на 7.");
        } else {
            System.out.println("введённое с клавиатуры целое число НЕ делится на 7.");
        }
    }

    /**
     * Написать программу которая вычисляет частное двух чисел.
     * Программа должна проверять правильность введенных пользователем данных и, если они неверные (делитель равен нулю), выдавать сообщение об ошибке.
     */

    public static void hometask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dividend ");
        System.out.println("Input divisor ");
        int numberA = scanner.nextInt(), numberB = scanner.nextInt(), numberC;
        if (numberB != 0) {
            numberC = numberA / numberB;
            System.out.println("quotient = " + numberC);
        } else {
            System.out.println("No solutions ");
        }
    }

    /**
     * Написать программу для проверки знания даты основания Одессы.
     * В случае неправильного ответа пользователя, программа должна выводить правильный ответ.
     * Ниже приведён возможный вид экрана во время выполнения такой программы (данные, введенные пользователем, выделены полужирным шрифтом).
     */
    public static void hometask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год основания Одессы!");
        int c = scanner.nextInt();
        if (c == 1794) {
            System.out.println("ПРАВИЛЬНЫЙ ОТВЕТ ");
        } else {
            System.out.println("НЕПРАВИЛЬНЫЙ ОТВЕТ");
        }
    }

    /**
     * Написать программу для вычисления стоимости покупки с учетом скидки.
     * Скидка в 3% предоставляется, если сумма покупки больше 500 грн., в 5% — если сумма больше 1000 грн.
     * Ниже приведён возможный вид экрана во время выполнения такой программы (данные, введенные пользователем, выделены полужирным шрифтом).
     */
    public static void hometask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму на которую вы сделали покупку");
        int a = scanner.nextInt(), q1, q2, a1, a2;

        if (a >= 0 && a <= 500) {
            System.out.println("На эту сумму скидки не будет");
        } else {
            System.out.println("На эту сумму скидки не будет ");
        }
        if (a >= 501 && a <= 1000) {
            System.out.println(" Cкидка составляет 3%");
            q1 = a * 3 / 100;
            a1 = a - q1;
            System.out.println("Сумма составляет = " + a1);


        }
        if (a >= 1001) {
            System.out.println("Скидка составляет 5%");
            q2 = a * 5 / 100;
            a2 = a - q2;
            System.out.println("Сумма составляет =" + a2);
        }
    }

    /**
     * Написать программу для вычисления стоимости разговора по телефону
     * с учетом 20% скидки предоставляемой по субботам и воскресеньям.
     */
    public static void hometask7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете день недели цифрой:\n1.Понедельник\n 2.Вторник\n 3.Среда \n 4.Четверг\n 5.Пятница\n 6.Суббота\n7.Воскресенье");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("Скидки на телефонный разговор не будет");
        } else if (day >= 6 && day <= 7) {
            System.out.println("На телефонный разговор будет скидка 20%");
        } else if (day <= 0 && day >= 8) {
            System.out.println("Такого дня недели не существует");
        }


    }

    /**
     * Дано трехзначное число. Определить, какая из его цифр больше:
     * а) первая или последняя;
     * б) первая или вторая;
     * в) вторая или последняя
     */
    public static void hometask8() {
        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = 0, decimals = 0, ones = 0;
        ones = number / 1 % 10;
        decimals = number / 10 % 10;
        hundreds = number / 100 % 10;
        if (ones > hundreds) {
            System.out.println("больше чем");
        } else {
            System.out.println("меньше чем");
        }
        if (ones > decimals) {
            System.out.println("больше чем");
        } else {
            System.out.println("меньше чем");
        }
        if (decimals > hundreds) {
            System.out.println("больше чем ");
        } else {
            System.out.println("меньше чем");
        }
    }

    /**
     * Сумма прописью: пользователь вводит число от 1 до 9999.
     * Необходимо вывести на экран словами введенную сумму и в конце написать название валюты с правильным окончанием.
     */
    public static void hometask9() {
        System.out.println("Введите четырехзначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tensOfThousands = 0, thousands = 0, hundreds = 0, decimals = 0, ones = 0;
        ones = number / 1 % 10;
        decimals = number / 10 % 10;
        hundreds = number / 100 % 10;
        thousands = number / 1000 % 10;
        if (number < 0 || number > 9999) {
            System.out.println("Число введено неправильно");
        } else {
            System.out.println("Вы ввели " + number);
        }
        if (thousands == 1) {
            System.out.println("Одна тысяча");

        } else if (thousands == 2) {
            System.out.println("Две тысячи");
        } else if (thousands == 3) {
            System.out.println("Три тысячи");
        } else if (thousands == 4) {
            System.out.println("Четыри тысячи");
        } else if (thousands == 5) {
            System.out.println("Пять тысяч");
        } else if (thousands == 6) {
            System.out.println("Шесть тысяч");
        } else if (thousands == 7) {
            System.out.println("Семь тысяч");
        } else if (thousands == 8) {
            System.out.println("Восемт тысяч");
        } else if (thousands == 9) {
            System.out.println("Девять тысяч");
        }
        if (hundreds == 1) {
            System.out.println("Сто");

        } else if (hundreds == 2) {
            System.out.println("Двести");
        } else if (hundreds == 3) {
            System.out.println("Триста");
        } else if (hundreds == 4) {
            System.out.println("Четыриста");
        } else if (hundreds == 5) {
            System.out.println("Пятьсот");
        } else if (hundreds == 6) {
            System.out.println("Шестьсот");
        } else if (hundreds == 7) {
            System.out.println("Семьсот");
        } else if (hundreds == 8) {
            System.out.println("Восемьсот");
        } else if (hundreds == 9) {
            System.out.println("Девятьсот");
        }
        if (decimals / 10 == 1) {
            System.out.println("Одинадцать долларов ");

        } else if (decimals / 10 == 2) {
            System.out.println("Двенадцать долларов");
        } else if (decimals / 10 == 3) {
            System.out.println("Тринадцать долларов");
        } else if (decimals / 10 == 4) {
            System.out.println("Четырнадцать долларов");
        } else if (decimals / 10 == 5) {
            System.out.println("Пятьнадцать долларов");
        } else if (decimals / 10 == 6) {
            System.out.println("Шестьнадцать долларов");
        } else if (decimals / 10 == 7) {
            System.out.println("Семьнадцать долларов");
        } else if (decimals / 10 == 8) {
            System.out.println("Восемьнадцать долларов");
        } else if (decimals / 10 == 9) {
            System.out.println("Девятьнадцать долларов");
        }
        if (decimals == 1) {
            System.out.println("Десять");
        } else if (decimals == 2) {
            System.out.println("Двадцать");
        } else if (decimals == 3) {
            System.out.println("Тридцать");
        } else if (decimals == 4) {
            System.out.println("Сорок");
        } else if (decimals == 5) {
            System.out.println("Пятьдесят");
        } else if (decimals == 6) {
            System.out.println("Шестьдесят");
        } else if (decimals == 7) {
            System.out.println("Семьдесят");
        } else if (decimals == 8) {
            System.out.println("Восемьдесять");
        } else if (decimals == 9) {
            System.out.println("Девяносто");
        }


        if (ones == 1) {
            System.out.println("один доллар");

        } else if (ones == 2) {
            System.out.println("Два доллара");
        } else if (ones == 3) {
            System.out.println("Три доллара");
        } else if (ones == 4) {
            System.out.println("Четыре доллара");
        } else if (ones == 5) {
            System.out.println("Пять долларов");
        } else if (ones == 6) {
            System.out.println("Шесть долларов");
        } else if (ones == 7) {
            System.out.println("Семь долларов");
        } else if (ones == 8) {
            System.out.println("Восемь долларов");
        } else if (ones == 9) {
            System.out.println("Девять долларов");
        }

    }

    /**
     * Определить, является ли год, который ввел пользователем, високосным или нет. (Високосные года делятся нацело на 4.
     * Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются. Например, 2000 - високосный, а 2100 — нет).
     */
    public static void hometask5() {
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year < 0 && year > 9999) {
            System.out.println("Год введен неправильно");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год\n" + year + "Высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }

    /*
    Даны вещественные числа х и у, не равные друг другу.
    Используя тернарный оператор, заменить меньшее из этих двух чисел половиной их суммы, а большее — их удвоенным произведением.
     */
    public static void hometask10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        System.out.println("Введите второе число");
        double n1= scanner.nextDouble();
        double n2= scanner.nextDouble();


    }
}










