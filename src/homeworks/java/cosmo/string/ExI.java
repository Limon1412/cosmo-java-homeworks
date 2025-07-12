package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };
        for(int i=0;i<input.length;i++){
            if(input[i].length()==11){
                input[i]= String.format("+7-%s-%s-%s-%s",
                        input[i].substring(1,4),
                        input[i].substring(4,7),
                        input[i].substring(7,9),
                        input[i].substring(9));
            }else if(input[i].length()==12){
                input[i]= String.format("+7-%s-%s-%s-%s",
                        input[i].substring(2,5),
                        input[i].substring(5,8),
                        input[i].substring(8,10),
                        input[i].substring(10));
            } else{
                input[i]= String.format("+7-%s-%s-%s-%s",
                        input[i].substring(0,3),
                        input[i].substring(3,6),
                        input[i].substring(6,8),
                        input[i].substring(8));
            }
        }
        System.out.println(Arrays.toString(input));;
    }
}