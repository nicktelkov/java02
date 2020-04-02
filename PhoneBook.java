/*
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи.
        С помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.
*/

public class PhoneBook {
    int id;
    String firstName;
    String lastName;
    long phone1;
    long phone2;
    long phone3;

    public PhoneBook(String firstName, String lastName, long phone1, long phone2, long phone3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        id++ ;
    }

    public PhoneBook(String lastName, long phone1) {
        this.lastName = lastName;
        this.phone1 = phone1;
        id++ ;
    }


    public PhoneBook(String firstName, long phone1, long phone2) {
        this.firstName = firstName;
        id++ ;
    }

    public void lastNameInfo () {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }


}
