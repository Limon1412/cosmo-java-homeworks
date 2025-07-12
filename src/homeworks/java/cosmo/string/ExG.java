package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] arrayInput = input.split(" ");
        arrayInput[2]=arrayInput[2].replace("?","");
        arrayInput[2]=arrayInput[2].replaceFirst("д","Д");
        arrayInput[0]=arrayInput[0].replace("Г","г");
        for(int i=arrayInput.length-1;i>=0;i--){
            if(i!=0)
                System.out.print(arrayInput[i]+" ");
            else
                System.out.print(arrayInput[i]+"?");
        }


    }
}