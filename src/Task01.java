
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(FloatInput());

    }
    public static Float FloatInput(){
        System.out.println("Введите дробное число:");
        Scanner scanner = new Scanner(System.in);
        float result;
        while(true){
            String value = scanner.next();
           try{
               result = Float.parseFloat(value);
               return result;
           }
           catch (NumberFormatException e){
               System.out.println("Нужно вводить дробные числа!");
           }
        }

    }

}