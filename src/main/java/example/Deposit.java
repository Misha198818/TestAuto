package example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deposit {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество месяцев: ");

        //получаем количество месяцев
        //обрабатываем возможные ошибки
        int monthCount = 0;
        try {
            monthCount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Неожиданный формат данных!");
            System.err.println("Попробуйте еще раз!");
            scanner.close();
            return;
        }

        System.out.print("Введите сумму вклада: ");
        
        //получаем сумму вклада
        //обрабатываем возможные ошибки
        float summ = 0;
        try {
            summ = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Неожиданный формат данных!");
            System.err.println("Попробуйте еще раз!");
            scanner.close();
            return;          
        }

        //базовая ставка депозита   
        float stavka = 7;

        //вычисляем итоговую сумму вклада
        for(int i = 0; i < monthCount; i++){
            summ = summ * (stavka/100 + 1);
        }
        
        System.out.println("Конечная сумма вклада: " +  Math.round(summ * 100.0) / 100.0);

        scanner.close();        
    }
}
