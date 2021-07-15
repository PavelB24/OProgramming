package ru.gb;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Employee[] empArray= new Employee[5];
    empArray[0]= new Employee("Баринов Павел Владимирович", "Андроид-разработчик", "alkatrazzzzz@mail.ru", 89992476337L, 140000, 27 );
    empArray[1]= new Employee("Пупкин Николай Свинкович", "Дизайнер интерфейса", "arbuzik@mail.ru", 89215563387L, 11200, 41 );
    empArray[2]= new Employee("Рожаева Анастасия Морановна", "Уборщик", "brazzzers@gmail.com", 89523686337L,158500 , 24 );
    empArray[3]= new Employee("Тарецкий Иван Олегович", "Менеджер по продажам", "zontik11@yandex.ru", 89054467185L, 21000, 32 );
    empArray[4]= new Employee("Тельников Виктор Сергеевич", "Тестировщик", "loungeplacemate@yahoo.com", 89213373967L, 91000, 55 );
        System.out.printf("Колличество работников: %d \n", Employee.getCount());
    int age=toChooseTheAgeForSorting();
   sortByAge(age, empArray);
   empArray[0].setName("Витя");
   empArray[1].setAge(18);
   Car myCar= new Car(188681, "black", "Crossover", 150, "o918eo178");
        System.out.println();

   Car herCar= new Car();                   //Преобразование классов. Из легковушки в автомобиль и назад в легковушку
   Vehicle herVehicle = herCar;
   Car herVehCar = (Car)herVehicle;
   myCar.getInfo();
        List<Car> carList= new ArrayList<>();
        carList.add(myCar);
        carList.add(new Car());
        carList.add(new Car());
        carList.get(0).getInfo();
        System.out.println(myCar.toString());




    }
    public static void sortByAge (int age, Employee[] empArray) {
        for (int i = 0; i < empArray.length ; i++) {
            if (empArray[i].getAge()>age){
                empArray[i].getInfo();
                System.out.println();
            }

        }
    }
    public static Integer toChooseTheAgeForSorting(){System.out.println("Введите возраст для сортировки");
        Scanner sc = new Scanner(System.in);
       int selectedAge=sc.nextInt();
        return selectedAge;
    }


}

