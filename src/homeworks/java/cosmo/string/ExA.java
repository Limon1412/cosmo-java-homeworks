package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит её без пробелов.
 * Мама мыла Милу мылом! -> МамамылаМилумылом!
 * <p>
 * Подсказка: используйте метод .replace() класса String
 */
public class ExA {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
//        for(int i=0;i<input.length();i++){
//            if(input.charAt(i)!=' '){
//                System.out.print(input.charAt(i));
//            }
        input=input.replace(" ","");
        System.out.println(input);

    }
}