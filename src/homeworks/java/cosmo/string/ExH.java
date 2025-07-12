package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        StringBuilder stringBuilder = new StringBuilder();
        String[] splitedFullName = fullName.split(" ");
        for(String word : splitedFullName){
            stringBuilder.append(word.charAt(0)).append('.');
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
