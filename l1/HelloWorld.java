package l1;


public class HelloWorld {
    public static void main(String[] args) {

        // объявление и инициализация нового массива
        String[] args2 = new String[3];
        args2[0] = "Kat";
        args2[1] = "Pas";
        // объявление и инициализация нового массива сразу
        int intArray[] = {1, 2, 3, 4};

        //печать с аргументом из окружения
        System.out.println(String.format("Hello, %s!", args[0]));
        //печать с аргументом из массива
        System.out.println(String.format("Hello, %s!", args2[0]));
        //печать с аргументом из массива c числами, четвертый элемент
        System.out.println(intArray[3]);
    }
}
