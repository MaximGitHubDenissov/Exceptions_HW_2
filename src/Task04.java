//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        ValidInput();

    }

    public static void ValidInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String result = sc.nextLine();
        result = result.trim();
        if(result.isEmpty()){
            throw new IllegalArgumentException("Строка не может быть пустой!");
        }else {
            System.out.println(result);
        }


    }
}
