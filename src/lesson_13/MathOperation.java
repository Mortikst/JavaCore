package src.lesson_13;

public class MathOperation {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Прибавление
        int sum = x + y;
        //System.out.println(sum);

        //Вычетание
        int diff = x - y;
        //System.out.println(diff);

        //умоножение
        int multiply = x * y;
        //System.out.println(multiply);

        //Деление
        y = 3;
        double divide = (double) x / y;
        //System.out.println(divide);

        //Возведение в степень
        int ext = x * x;
        //System.out.println(ext);

        //Иткремент
        //x = x + 1;
        //x++;
//        System.out.println(x);
//
        //Сокращенная форма записи
//        x += 10;
//        x *= 10;
//        x /= 2;

        //Декремент
//         x = x -1;
//         x--;
//         System.out.println(x);

        //Остаток от деления
        int number = 4;
        // 4 - 2 - 2 = 0
        // 5 - 2 - 2 = 1
        // 7 - 3 - 3 = 1
        int modulo = number % 3;
        System.out.println(modulo);

        //Скобки
        int z = (2 + 2) * 2;
        System.out.println(z);
    }
}
