package ru.gb;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("Баринов Павел Владимирович", "Андроид-разработчик", "alkatrazzzzz@mail.ru", 89992476337L, 140000, 27 ));
        employeeList.add(new Employee("Пупкин Николай Свинкович", "Дизайнер интерфейса", "arbuzik@mail.ru", 89215563387L, 11200, 41 ));
        employeeList.add(new Employee("Рожаева Анастасия Морановна", "Уборщик", "brazzzers@gmail.com", 89523686337L,158500 , 24 ));
        employeeList.add(new Employee("Тарецкий Иван Олегович", "Менеджер по продажам", "zontik11@yandex.ru", 89054467185L, 21000, 32 ));
        employeeList.add(new Employee("Тельников Виктор Сергеевич", "Тестировщик", "loungeplacemate@yahoo.com", 89213373967L, 91000, 55 ));
        System.out.printf("Колличество работников: %d \n", Employee.getCount());
    int age=toChooseTheAgeForSorting();
   sortByAge(age,  employeeList);
        employeeList.get(0).setName("Витя");
        employeeList.get(1).setAge(18);
   Car myCar= new Car(188681, "black", "Crossover", 150, "o918eo178");
        System.out.println();

   Car herCar= new Car();                   //Преобразование классов. Из легковушки в автомобиль и назад в легковушку
   Vehicle herVehicle = herCar;
   Car herVehCar = (Car)herVehicle;
   Vehicle hisCar= new Car();
   HumanInterface hI = new HumanInterface() {       //Ананомные классы, сослал на интерфейс, кстати, что интересно
       @Override
       public void toDoSomething() {
           System.out.println("Я что-то сделал, я молодец");
       }
   };
//   hI.toDoSomething();
//   myCar.getInfo();
        List<Car> carList= new ArrayList<>();
        carList.add(myCar);
        carList.add(new Car(1585));
        carList.add(new Car(48488));
//        carList.get(0).getInfo();
//        System.out.println(myCar.toString());
//        testList(carList);
        carList.add(new Car(415551181));
//        Car car3= new Car(){
//            public void getInfo(){
//                System.out.println("Машина в сервисе");
//            }
//        };
//        car3.getInfo();


    }





    public static void testList(List<Car> list){
        for (Car car: list) {
            System.out.println(car.toString());
        }
    }

    public static void sortByAge (int age, List<Employee> list) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getAge()>age){
                list.get(i).getInfo();
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

