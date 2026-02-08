import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        //Задача 1. Переменные и арифметика
        int a = 65;
        int b = 3;
        int sum = a + b;
        int diff = a - b;
        int multiplication = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println("Сумма a и b = " + sum);
        System.out.println("Разница a и b = " + diff);
        System.out.println("Произведение a и b = " + multiplication);
        System.out.println("Результат целочисленного деления a и b = " + div);
        System.out.println("Остаток от деления a и b = " + rem);

        //Задача 2. Инкремент и декремент
        int x = 7;
        int y = ++x; //было x++
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Задача 3. Сравнение чисел
        a = 467;
        b = -2;
        if (a > b){
            System.out.println(a > b);
        }
        else if(a == b){
            System.out.println(a == b);
        }
        else {
            System.out.println(a < b);
        }

        //Задача 4. Логические операторы
        int age = 20;
        boolean hasTicket = true;
        if (age >= 18 && hasTicket) {
            System.out.println("Проход разрешён");
        } else {
            System.out.println("Проход запрещён");
        }

        //Задача 5. Простая проверка числа
        int number = 20;
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }

        //Задача 6. Тернарный оператор
        int n = -10;
        int absN = (n >= 0) ? n : -n;

        System.out.println("Исходное число: " + n);
        System.out.println("Абсолютное значение: " + absN);

        //Задача 7. switch — календарь
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Некорректный день");
        }
    }
}