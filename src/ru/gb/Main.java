package ru.gb;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {
    Employee[] empArray= new Employee[5];
    empArray[0]= new Employee("Баринов Павел Владимирович", "Андроид-разработчик", "alkatrazzzzz@mail.ru", 89992476337L, 140000, 27 );
    empArray[1]= new Employee("Пупкин Николай Свинкович", "Дизайнер интерфейса", "arbuzik@mail.ru", 89215563387L, 140000, 41 );
    empArray[2]= new Employee("Рожаева Анастасия Морановна", "Уборщик", "brazzzers@gmail.com", 89523686337L, 140000, 24 );
    empArray[3]= new Employee("Тарецкий Иван Олегович", "Менеджер по продажам", "zontik11@yandex.ru", 89054467185L, 140000, 32 );
    empArray[4]= new Employee("тельников Виктор Сергеевич", "Тестировщик", "loungeplacemate@yahoo.com", 89213373967L, 140000, 55 );
    int selectedAge=40;
    showInfo(selectedAge,empArray);
    }
    public static void showInfo (int age, Employee[] empArray) {
        for (int i = 0; i < empArray.length ; i++) {
            if (empArray[i].getAge()>40){
                empArray[i].getInfo();
                System.out.println();
            }

        }
    }
}

