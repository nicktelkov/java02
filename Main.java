import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main (String args) {
    //Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
    //Класс - PhoneBook.java

    //Вариант HashMap

        HashMap<String, Long, Long, Long> phoneBook00 = new HashMap<>();
        phoneBook00.put("Ivanov", 89055555555l);
        phoneBook00.put("Petrov", 89051111111l);
        phoneBook00.put("Sidorov", 89052222222l, 89057777777l);

        System.out.println(phoneBook00.get("Ivanov"));

     //Вариант с ArrayList
    ArrayList<String> names = new ArrayList();
    names.add("Ivanov") ;
    names.add("Petrov") ;
    names.add("Sidorov") ;

    PhoneBook[] book = new PhoneBook[3];
    book[Integer.parseInt(names.get(0))] = new PhoneBook(names.get(0),89055555555l);
    book[Integer.parseInt(names.get(1))] = new PhoneBook(names.get(1), 89051111111l);
    book[Integer.parseInt(names.get(2))] = new PhoneBook(names.get(2), 89052222222l, 89057777777l);

    // С помощью метода get() искать номер телефона по фамилии.
    //  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    //  тогда при запросе такой фамилии должны выводиться все телефоны.
    book[Integer.parseInt(names.get(2))].lastNameInfo();

    }
}


/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать сколько раз встречается каждое слово.

2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи.


Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().

 */