import ForTask2.PhoneBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        doTask1();
        doTask2();

    }


    static void doTask1() {
        System.out.println("Task1");

        // Создаем массив слов

        List<String> wordsArrayList = Arrays.asList("кошка","одеялко","роботы","ницше",
                "мороженка","одеялко","ницше","ницше",
                "кошка","это","все","какие-то","слова");

        // Выводим список уникальных слов

        Set setWords = new HashSet();
        setWords. addAll(wordsArrayList);
        System.out.println(setWords);

        //Считаем, сколько раз встречается каждое слово.

            for(Object o : setWords) {
            String element = (String) o;
            int count = 0;
                for (String s : wordsArrayList) {
                    if (s.equals(element)) count++;
                }
            System.out.printf("Слово [%s] в массиве встречается %s раз", element, count);
                System.out.println();
        }

    }


    private static void doTask2() {
        System.out.println("Task2");

        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook);
        phoneBook.add("ivanov", 4521);
        phoneBook.add("petrov", 6830);
        phoneBook.add("mihailova", 8210);
        phoneBook.add("mihailova", 8210);
        phoneBook.add("ivanov", 4520);
        System.out.println(phoneBook);
        System.out.println(phoneBook.get("ivanov"));
    }
}
