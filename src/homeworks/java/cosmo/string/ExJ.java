package homeworks.java.cosmo.string;

/**
 * Дан массив со строками: {“Дом”, “Стена”, “Машина”, “Телефон”, “Кот”, “Микроволновка”, “Деньги”, “Яхта”}.
 * Необходимо найти в данном массиве самую длинную строку и вывести ее на экран.
 * {...} > Микроволновка
 * <p>
 * Подсказка: используйте метод .length() класса String
 */
public class ExJ {
    public static void main(String[] args) {
        String[] input = {"Дом", "Стена", "Машина", "Телефон", "Кот", "Микроволновка", "Деньги", "Яхта" };
        String max="";
        for(String word : input){
            if(word.length()>max.length()){
                max=word;
            }
        }
        System.out.println(max);
    }
}