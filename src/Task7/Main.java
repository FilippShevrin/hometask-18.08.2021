package Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main (String [] args) {


        partOfStringUser();
    }

    public static void partOfStringUser () {
        System.out.print("Введите число:");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String[] String_array = userString.split(" ");
        String_array[1].length();
        double result;
        if(String_array.length>3){
            System.err.println("число вводимых значений не может быть больше 3");
            throw new IllegalArgumentException();
        }
        try {
            double    test1 = Double.parseDouble(String_array[0]);
            double    test2 = Double.parseDouble(String_array[2]);
            System.out.println(test1+" "+ test2);
        } catch (NumberFormatException e) {
            System.err.println("было введено не число");
        }
        double part1 = Double.parseDouble(String_array[0]);
        double part2 = Double.parseDouble(String_array[2]);
        switch (String_array [1]) {
            case "плюс": {
                result =  (part1+part2);
                break;
            }
            case "минус": {
                result =  (part1-part2);
                break;
            }
            case "умножить": {
                result =  (part1*part2);
                break;
            }
            case "делить": {
                if( part2 == 0){
                    System.err.println("деление на ноль");
                    throw new ArithmeticException();}
                else result =  (part1/part2);
                break;
            }
            default: {
                System.err.println("арифметическая операция не обнаружена");
                throw new ArithmeticException();}
        }
        System.out.println(result);

    }

}