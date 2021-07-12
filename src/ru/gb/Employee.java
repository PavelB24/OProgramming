package ru.gb;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long phoneNumber, int salary, int age){
    this.name=name;
    this.position=position;
    this.email=email;
    this.phoneNumber=phoneNumber;
    this.salary=salary;
    this.age=age;

}

    public void getInfo(){
        System.out.println("Имя: " +name );
        System.out.println("Должность: " +position );
        System.out.println("Е-мейл: " +email );
        System.out.println("Номер телефона: " +phoneNumber );
        System.out.println("Зарплата " +salary );
        System.out.println("Возраст " +age );
    }

    public Integer getAge(){
        return age;
    }
}
